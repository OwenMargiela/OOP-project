package groupWork;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

    public static void main(String arg[]) {

        GenericValue<Object> attributeToReplace;
        GenericValue<Object> replacementValue;

        attributeToReplace = Helper.getInputValue("Enter the attribute you wish to replace: ");
        replacementValue = Helper.getInputValue("What do you wish to replace it with: ");

        if (attributeToReplace.getValue().getClass() != replacementValue.getValue().getClass()) {
            System.out.println("Elements are not of the same type.");
        } else {
            System.out.println("Replacement successful." + replacementValue.getValue().getClass());
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

}
