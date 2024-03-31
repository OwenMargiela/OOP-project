package groupWork;

import java.io.*;
import java.util.*;

public class Coach {
    private String trn;
    private String full_name;
    private Date date_of_birth;
    private String gender;
    private Date employment;
    private Date date_separation;
    private float commission_rate;

    Coach(String trn, String full_name,
            Date date_of_birth, String gender,
            Date employment, Date date_separation,
            float commission_rate) {
        this.trn = trn;
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.employment = employment;
        this.date_separation = date_separation;
        this.commission_rate = commission_rate;

    }

    public String getTrn() {
        return trn;
    }

    public String getFullName() {
        return full_name;
    }

    public Date getDateOfBirth() {
        return date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public Date getEmployment() {
        return employment;
    }

    public Date getDateSeparation() {
        return date_separation;
    }

    public float getCommissionRate() {
        return commission_rate;
    }

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public void setFullName(String full_name) {
        this.full_name = full_name;
    }

    public void setDateOfBirth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmployment(Date employment) {
        this.employment = employment;
    }

    public void setDateSeparation(Date date_separation) {
        this.date_separation = date_separation;
    }

    public void setCommissionRate(float commission_rate) {
        this.commission_rate = commission_rate;
    }

    public void addCoach() {

        try {
            FileWriter coachFile = new FileWriter("Coaches.txt", true);
            coachFile.write(this.trn + " ");
            coachFile.write(this.full_name + " ");

            coachFile.write(this.date_of_birth.GetDay() + "/" +
                    this.date_of_birth.GetMonth() + "/" +
                    this.date_of_birth.GetYear() + " ");

            coachFile.write(this.gender + " ");

            coachFile.write(this.employment.GetDay() + "/" +
                    this.employment.GetMonth() + "/" +
                    this.employment.GetYear() + " ");

            coachFile.write(this.date_separation.GetDay() + "/" +
                    this.date_separation.GetMonth() + "/" +
                    this.date_separation.GetYear() + " ");

            coachFile.write(this.commission_rate + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void edit_coach(String attributeToReplace, String replacementValue) throws IOException {

        File orignial = new File("Coaches.txt");
        File temporaryFile = new File("TempCoaches.txt");

        try {

            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
            BufferedReader coachScanner = new BufferedReader((new FileReader(orignial)));

            String line;
            while ((line = coachScanner.readLine()) != null) {
                String[] parts = line.split(" ");
                tempFileWriter.write(line + "\n");

                if (parts[0].equals(this.trn)) {
                    line.replace(attributeToReplace, replacementValue);
                    tempFileWriter.write(line + "\n");

                    System.out.println(line);
                    continue;
                }

                System.out.println(parts[0] + " != " + this.trn);

            }

            temporaryFile.renameTo(orignial);
            orignial.delete();
            tempFileWriter.close();
            coachScanner.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
