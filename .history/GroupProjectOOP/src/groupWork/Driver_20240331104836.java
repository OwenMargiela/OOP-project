package groupWork;

import java.io.IOException;

public class Driver {

    public static void main(String arg[]) {

        Coach coach = new Coach("001",
                "Dylan Mason",
                new Date(29, 1, 2005),
                "F",
                new Date(29, 3, 2012),
                new Date(0, 0, 0),
                25000.00F);

        try {
            coach.delete_coach();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
