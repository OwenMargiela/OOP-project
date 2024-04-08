package groupWork;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Authenticater {

    public void addUser(String id, String password, String userType) {
        // Define the file name
        String fileName = "users.txt";

        try {

            FileWriter fileWriter = new FileWriter(fileName, true);

            // Append the user ID and password to the file, separated by a delimiter
            fileWriter.write(password + " ");
            fileWriter.write(id + " ");
            fileWriter.write(userType + "\n");

            fileWriter.close();

            System.out.println("User added successfully!");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public int Authenticate() {

        int level = 0;

        HashMap<String, String> map = creatMap();

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Enter username.For non-admins, your username is your id/trn: ");
        username = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();

        // We get the corresponding value from the password key, which be the username
        // associated with it
        String value = map.get(password);
        // Eg .value = "admin Admin "
        String[] values = value.split(" ");
        // values = ["admin", "Admin"]
        System.out.println("Value is " + values[0] + " username is " + username);
        // if values is null, there is no user. Else if the value is equal to the
        // username entered
        if (values != null && values[0].equals(username)) {
            switch (values[1]) {
                case "Admin":
                    level = 4;
                    break;
                case "Athlete":
                    level = 3;
                    break;

                case "Association":
                    level = 2;
                    break;

                case "Club":
                    level = 1;
                    break;

                default:
                    System.out.println("Unidentifiable user type.");
                    level = -999;
                    break;
            }
        } else {
            System.out.println("Email or password not valid");
            level = -999;
        }

        scanner.close();
        return level;
    }

    private static HashMap<String, String> creatMap() {
        HashMap<String, String> userMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("users.txt"));
            while (scanner.hasNext()) {
                // Splits the line password " " id
                // into an array [password, id]

                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                // Places the information into a map using password as the key
                userMap.put(parts[0], parts[1] + " " + parts[2]);
                // The map can be visualized as
                // hash map = { key: 123, value: {username: "admin" + " " + userType "Admin"} }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userMap;
    }

}
