package groupWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoachFile {

    public void addCoach(Coach obj) {

        try {
            FileWriter coachFile = new FileWriter("Coaches.txt", true);
            coachFile.write(obj.trn + " ");
            coachFile.write(obj.full_name + " ");

            coachFile.write(obj.date_of_birth.GetDay() + "/" +
                    obj.date_of_birth.GetMonth() + "/" +
                    obj.date_of_birth.GetYear() + " ");

            coachFile.write(obj.gender + " ");

            coachFile.write(obj.employment.GetDay() + "/" +
                    obj.employment.GetMonth() + "/" +
                    obj.employment.GetYear() + " ");

            coachFile.write(obj.date_separation.GetDay() + "/" +
                    obj.date_separation.GetMonth() + "/" +
                    obj.date_separation.GetYear() + " ");

            coachFile.write(obj.commission_rate + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void delete_coach() throws IOException {
        File orignial = new File("Coaches.txt");
        File temporaryFile = new File("TempCoaches.txt");

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;

            while ((line = coachFileScanner.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts[0].equals(this.trn)) {
                    continue;
                }

                tempFileWriter.write(line + "\n");
            }

            tempFileWriter.close();
            coachFileScanner.close();
            orignial.delete();
            File newFileName = new File("Coaches.txt");
            temporaryFile.renameTo(newFileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void edit_coach(String attributeToReplace, String replacementValue) throws IOException {

        File orignial = new File("Coaches.txt");
        File temporaryFile = new File("TempCoaches.txt");

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;
            while ((line = coachFileScanner.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts[0].equals(this.trn)) {
                    line = line.replace(attributeToReplace, replacementValue);
                    tempFileWriter.write(line + "\n");
                    continue;
                }

                tempFileWriter.write(line + "\n");
            }

            tempFileWriter.close();
            coachFileScanner.close();
            orignial.delete();
            File newFileName = new File("Coaches.txt");
            temporaryFile.renameTo(newFileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
