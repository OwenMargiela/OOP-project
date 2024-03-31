package groupWork;

import java.io.IOException;

public class Driver {
    public static void main(String arg[]) {

        Coach coach = new Coach("001",
                "Dave Mason",
                new Date(29, 1, 2005),
                "F",
                new Date(29, 3, 2012),
                new Date(0, 0, 0),
                25000.00F);

        FileHandle coachFile = new FileHandle();
        // coachFile.addCoach(coach);
        try {

            coachFile.addCoach(coach);
            ;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
