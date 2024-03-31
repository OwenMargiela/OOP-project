package groupWork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

    public void deleteRecord(String identifier) throws IOException {
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

}
