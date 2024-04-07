package groupWork;

public class Driver {
    public static void main(String arg[]) {

        Authenticater auth = new Authenticater();

        // auth.addUser("000-000-000", "honors29");
        int level = auth.Authenticate();
        System.out.println("Level of Acces is : " + level);

        /*
         * 
         * Coach coach = new Coach("001",
         * "Dave Mason",
         * new Date(29, 1, 2005),
         * "F",
         * new Date(29, 3, 2012),
         * new Date(0, 0, 0),
         * 25000.00F);
         * 
         * 
         * 
         * //Prompts to accept user inputs are implemented the method
         * //It creates and returns a coachClass object
         * Coach coach = CoachClassMaker()
         * FileHandle coachFile = new FileHandle();
         * 
         * coachFile.addCoach(coach);
         * //file.write(coach.id)
         * //file.write(coach.ect....)
         * 
         * 
         * FileHandle coachFile = new FileHandle();
         * // coachFile.addCoach(coach);
         * try {
         * 
         * coachFile.deleteRecord("Coaches.txt", "001");
         * 
         * } catch (IOException e) {
         * 
         * e.printStackTrace();
         * }
         */
    }
}
