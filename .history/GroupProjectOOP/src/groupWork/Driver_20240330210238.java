package groupWork;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {

        GenericValue<Object> attributeToReplace;
        GenericValue<Object> replacementValue;

        attributeToReplace = getInputValue("Enter the attribute you wish to replace: ");
        replacementValue = getInputValue("What do you wish to replace it with: ");

        if (attributeToReplace.getValue().getClass() != replacementValue.getValue().getClass()) {
            System.out.println("Elements are not of the same type.");
        } else {
            System.out.println("Replacement successful.");
        }

    }

    /*
     * coach.addCoach("000",
     * "Andre Mason",
     * new Date(29, 1, 2005),
     * "F",
     * new Date(29, 3, 2015),
     * new Date(0, 0, 0),
     * 20000.00F);
     */

    private static GenericValue<Object> getInputValue(String message) {
        // TODO Auto-generated method stub

        System.out.println(message);
        String input = scanner.nextLine();

        if (input.contains("/")) {
            return new GenericValue<>(Helper.dateMaker());
        } else if (input.contains(".")) {
            float floatVal = Float.parseFloat(input);
            return new GenericValue<>(floatVal);
        } else if (input.matches("[a-zA-Z_$][a-zA-Z_$0-9]*")) {
            return new GenericValue<>(input);
        } else {
            try {
                int intValue = Integer.parseInt(input);
                return new GenericValue<>(intValue);
            } catch (NumberFormatException e) {
                return new GenericValue<>(input);
            }
        }
    }

}
