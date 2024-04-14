package groupWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

    // File Operation Class

    // Delete a record
    // We need to pass in the a the unique identifier: trn, id, club code
    // Must be a string
    // Must be the first value in the record
    // Eg trn value2 value3......

    public void deleteRecord(String Filename, String identifier) throws IOException {

        // This method
        // We pass in the the file of the record we want to delete
        // Writes the contents of the first file to the second file
        // The record we wish to delete is not added to the new file

        File orignial = new File(Filename);
        File temporaryFile = new File("Temp" + Filename);

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;

            while ((line = coachFileScanner.readLine()) != null) {
                // Gets a singular record in a file and places it into an array

                // Eg 000 Andre Mason 29/1/2005 M 29/3/2015 0/0/0 20000.0
                String[] parts = line.split(" ");

                if (parts[0].equals(identifier)) {
                    // In this case parts[0] == "000"
                    // If its equal to the identifier, we dont write it to the new file, effectively
                    // deleting it

                    continue;
                }

                tempFileWriter.write(line + "\n");
            }

            tempFileWriter.close();
            coachFileScanner.close();
            // We delete the old file and make the temporary file the main file
            orignial.delete();
            File newFileName = new File(Filename);
            temporaryFile.renameTo(newFileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void edit_record(String FileName, String attributeToReplace, String replacementValue, String identifier)
            throws IOException {

        // Similary to delete
        // Except the user should pass in the value the want to replace and the
        // replacement value

        File orignial = new File(FileName);
        File temporaryFile = new File("Temp" + FileName);

        try {
            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachFileScanner = new BufferedReader((new FileReader(orignial)));

            String line;
            while ((line = coachFileScanner.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts[0].equals(identifier)) {
                    // Lets say the line was 000 Andre Mason 29/1/2005 M 29/3/2015 0/0/0 20000.0
                    // In the case that attributeToReplace = Andre Mason and replacementValue =
                    // Dylan Mason
                    // This line.replace() method finds the substring "Andre Mason" and swaps it
                    // with "Dylan Mason"
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

}
