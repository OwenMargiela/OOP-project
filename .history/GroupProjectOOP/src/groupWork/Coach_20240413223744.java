package groupWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Coach {
    private String trn;
    private String fullName;
    private Date dateOfBirth;
    private String gender;
    private Date dateOfEmployment;
    private Date dateOfSeparation;
    private double commission;

    public Coach(String trn, String fullName, Date dateOfBirth, String gender, Date dateOfEmployment,
            Date dateOfSeparation, double commission) {
        this.trn = trn;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.dateOfEmployment = dateOfEmployment;
        this.dateOfSeparation = dateOfSeparation;
        this.commission = commission;
    }

    public Coach() {
        this.trn = "";
        this.fullName = "";
        this.dateOfBirth = null;
        this.gender = " ";
        this.dateOfEmployment = null;
        this.dateOfSeparation = null;
        this.commission = 0.00;
    }

    // Getters and setters
    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Date getDateOfSeparation() {
        return dateOfSeparation;
    }

    public void setDateOfSeparation(Date dateOfSeparation) {
        this.dateOfSeparation = dateOfSeparation;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void addCoach() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter TRN:");
        String trn = scanner.nextLine();

        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();

        // Assuming dateOfBirth, dateOfEmployment, and dateOfSeparation are entered as
        // strings

        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter Date of Date of Birth");
        System.out.println("Enter the day that the coach was born: ");
        int day = scanner.nextInt();

        System.out.println("Enter the month that the coach was born: ");
        int month = scanner.nextInt();

        System.out.println("Enter the year that the coach was born: ");
        int year = scanner.nextInt();

        Date dob = new Date(day, month, year);

        System.out.println("Enter Date of Separation:");
        System.out.println("Enter the day that the coach was separated: ");
        day = scanner.nextInt();

        System.out.println("Enter the month that the coach was separated: ");
        month = scanner.nextInt();

        System.out.println("Enter the year that the coach was separated: ");
        year = scanner.nextInt();

        Date dateOfSeparation = new Date(day, month, year);
        scanner.nextLine();

        System.out.println("Enter Date of Employment:");
        System.out.println("Enter the day that the coach was employment: ");
        day = scanner.nextInt();

        System.out.println("Enter the month that the coach was employment: ");
        month = scanner.nextInt();

        System.out.println("Enter the year that the coach was employment: ");
        year = scanner.nextInt();

        Date dateOfEmployment = new Date(day, month, year);

        System.out.println("Enter Commission:");

        double commission = scanner.nextDouble();

        Coach obj = new Coach(trn, fullName, dob, gender, dateOfEmployment, dateOfSeparation, commission);

        try {
            FileWriter coachFile = new FileWriter("CoachList.txt", true);
            coachFile.write(obj.getTrn() + " ");
            coachFile.write(obj.getFullName() + " ");

            coachFile.write(obj.getDateOfBirth().GetDay() + "/" +
                    obj.getDateOfBirth().GetMonth() + "/" +
                    obj.getDateOfBirth().GetYear() + " ");

            coachFile.write(obj.getGender() + " ");

            coachFile.write(obj.getDateOfEmployment().GetDay() + "/" +
                    obj.getDateOfEmployment().GetMonth() + "/" +
                    obj.getDateOfEmployment().GetYear() + " ");

            coachFile.write(obj.getDateOfSeparation().GetDay() + "/" +
                    obj.getDateOfSeparation().GetMonth() + "/" +
                    obj.getDateOfSeparation().GetYear() + " ");

            coachFile.write(obj.getCommission() + " " + "\n");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    // Method to print details of the coach
    public void printDetails() {
        System.out.println("TRN: " + trn);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Employment: " + dateOfEmployment);
        System.out.println("Date of Separation: " + dateOfSeparation);
        System.out.println("Commission: " + commission);
    }
}
