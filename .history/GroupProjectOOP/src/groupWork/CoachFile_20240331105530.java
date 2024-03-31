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
            coachFile.write(obj.getTrn() + " ");
            coachFile.write(obj.getFullName() + " ");

            coachFile.write(obj.getDateOfBirth().GetDay() + "/" +
                    obj.getDateOfBirth().GetMonth() + "/" +
                    obj.getDateOfBirth().GetYear() + " ");

            coachFile.write(obj.getGender() + " ");

            coachFile.write(obj.getEmployment().GetDay() + "/" +
                    obj.getEmployment().GetMonth() + "/" +
                    obj.getEmployment().GetYear() + " ");

            coachFile.write(obj.getDateSeparation().GetDay() + "/" +
                    obj.getDateSeparation().GetMonth() + "/" +
                    obj.getDateSeparation().GetYear() + " ");

            coachFile.write(obj.getClass() + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void delete_coach(String identifier) throws IOException {
        File orignial = new File("Coaches.txt");
        File temporaryFile = new File("TempCoaches.txt");

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;

            while ((line = coachFileScanner.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts[0].equals(identifier)) {
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

    public void edit_coach(String attributeToReplace, String replacementValue, String identifier) throws IOException {

        File orignial = new File("Coaches.txt");
        File temporaryFile = new File("TempCoaches.txt");

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;
            while ((line = coachFileScanner.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts[0].equals(identifier)) {
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
