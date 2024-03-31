package groupWork;

import java.util.*;

public class Helper {

    public static Scanner scanner = new Scanner(System.in);

    public static Date dateMaker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Date in the format DD/MM/YYYY/: ");
        String dateString = scanner.nextLine();

        // The date string is split and inserted into an array
        // The split method splits the string by the '/' character
        // The parts array = [ day , month , year ]

        String[] parts = dateString.split("/");

        // The Integer wrapper class contains the parseInt method
        // It turns the string into an integer

        Date date = new Date(Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2]));

        scanner.close();
        return date;
    }

    public static GenericValue<Object> getInputValue(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
        String input = scanner.nextLine();
        if (input.contains(".")) {
            float floatVal = Float.parseFloat(input);
            return new GenericValue<>(floatVal);
        }
        if (input.matches("[a-zA-Z_$][a-zA-Z_$0-9]*")) {
            return new GenericValue<>(input);
        }
        try {
            int intValue = Integer.parseInt(input);
            return new GenericValue<>(intValue);
        } catch (NumberFormatException e) {
            return new GenericValue<>(input);
        }

    }
}
