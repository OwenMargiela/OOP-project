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

}
