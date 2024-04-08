package groupWork;

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
