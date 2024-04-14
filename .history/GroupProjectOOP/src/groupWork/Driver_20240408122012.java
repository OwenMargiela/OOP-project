package groupWork;

class Driver {

    public static void main(String[] args) {

        Authenticater auth = new Authenticater();
        auth.addUser("admin", "1234", "Admin");
        auth.addUser("coach", "4567", "Coach");
        auth.addUser("asso", "abc", "Association");
        auth.addUser("player", "agy", "Athlete");
        auth.addUser("club", "jon", "Club");
        int accessLevel = auth.Authenticate();
        System.out.println(accessLevel);

        switch (accessLevel) {

            case 1:
                // Club
                break;

            case 2:

                // Association

                break;

            case 3:
                // Athlete
                break;

            case 4:
                // Admin
                break;

            default:
                // Not a user
                break;
        }
    }
}