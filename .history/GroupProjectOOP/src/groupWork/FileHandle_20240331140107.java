package groupWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

    public void deleteRecord(String Filename, String identifier) throws IOException {
        File orignial = new File(Filename);
        File temporaryFile = new File("Temp" + Filename);

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
            File newFileName = new File(Filename);
            temporaryFile.renameTo(newFileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void edit_record(String FileName, String attributeToReplace, String replacementValue, String identifier)
            throws IOException {

        File orignial = new File(FileName);
        File temporaryFile = new File("Temp" + FileName);

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
            File newFileName = new File(FileName);
            temporaryFile.renameTo(newFileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void addCoach(Coach obj)
            throws IOException {

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

            coachFile.write(obj.getCommissionRate() + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
