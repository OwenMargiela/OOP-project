package groupWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Authenticater {

    public static void addUser(String id, String password) {
        // Define the file name
        String fileName = "users.txt";

        try {

            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Append the user ID and password to the file, separated by a delimiter
            bufferedWriter.write(id + " " + password);
            bufferedWriter.newLine();

            System.out.println("User added successfully!");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static HashMap creatMap() {
        HashMap<String, String> userMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("users.txt"));

            while (scanner.hasNext()) {
                String key = scanner.nextLine();
                String value = scanner.nextLine();
                userMap.put(key, value);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return userMap;
    }

}
