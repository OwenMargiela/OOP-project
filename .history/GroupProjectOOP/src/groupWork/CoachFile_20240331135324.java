package groupWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CoachFile extends File {

    public CoachFile(String pathname) {
        super(pathname);
        // TODO Auto-generated constructor stub
    }

    public void addCoach(Coach obj) {

        try {
            FileWriter coachFile = new FileWriter("Coaches.txt", true);
            coachFile.write(obj.getTrn() + " ");
            coachFile.write(obj.getFullName() + " ");

            coachFile.write(obj.getDateOfBirth().GetDay() + "/" +
                    obj.getDateOfBirth().GetMonth() + "/" +
                    obj.getDateOfBirth().GetYear() + " ");

            coachFile.write(obj.getGender() + " ");

            coachFile.write(obj.getEmployment().GetDay() + "/" +
                    obj.getEmployment().GetMonth() + "/" +
                    obj.getEmployment().GetYear() + " ");

            coachFile.write(obj.getDateSeparation().GetDay() + "/" +
                    obj.getDateSeparation().GetMonth() + "/" +
                    obj.getDateSeparation().GetYear() + " ");

            coachFile.write(obj.getCommissionRate() + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
