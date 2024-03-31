package groupWork;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String arg[]) {

        Scanner scannner = new Scanner(System.in);
        GenericValue<Object> attribute_to_replace = new GenericValue<>();
        GenericValue<Object> replacement_value = new GenericValue<>();

        try {

            System.out.println("Enter the attribute you wish to replace: ");

            // If the string contains a '/', we are dealing with a Date;
            // If the string contains a '.', we are dealing with a Float;
            // Everything else is a string;

            // This may be converted to a function
            String attributeInput = scannner.nextLine();

            if (attributeInput.contains("/")) {
                attribute_to_replace.setValue(Helper.dateMaker());
            }

            if (attributeInput.contains(".")) {
                float floatVal = scannner.nextFloat();
                attribute_to_replace.setValue(floatVal);

            }
            attribute_to_replace.setValue(attributeInput);

            System.out.println("What do you wish to replace it with: ");

            String replacement_attribute_input = scannner.nextLine();

            if (replacement_attribute_input.contains("/")) {
                replacement_value.setValue(Helper.dateMaker());
            }

            if (replacement_attribute_input.contains(".")) {
                float floatVal = scannner.nextFloat();
                replacement_value.setValue(floatVal);

            }
            replacement_value.setValue(replacement_attribute_input);

            // This should be converted to a while to reprompt the user

            if (attribute_to_replace.getValue().getClass() != replacement_value.getValue().getClass()) {
                System.out.println("Elements are not of the same type.");
            }

            System.out.println(attributeInput + " " + replacement_attribute_input);

        } catch (Exception e) {
            System.err.println(e);
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

    }
}
