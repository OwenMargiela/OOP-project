package groupWork;

import java.io.*;
import java.util.*;

import GroupProjectOOP.GenericValue;

public class Coach {
    private String trn;
    private String full_name;
    private Date date_of_birth;
    private String gender;
    private Date employment;
    private Date date_separation;
    private float commission_rate;

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

    public void addCoach(String trn, String full_name,
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

        try {
            FileWriter coachFile = new FileWriter("Coaches.txt", true);
            coachFile.write(this.trn + " ");
            coachFile.write(this.full_name + " ");
            coachFile.write(this.date_of_birth.GetDay() + "/" +
                    this.date_of_birth.GetMonth() + "/" +
                    this.date_of_birth.GetYear() + " ");
            coachFile.write(this.gender + " ");
            coachFile.write(this.employment + " ");
            coachFile.write(this.date_separation + " ");
            coachFile.write(this.commission_rate + " ");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void edit_coach(String trn) throws IOException {
        Scanner scannner = new Scanner(System.in);

        File originalFile = new File("Coaches.txt");
        File tempFile = new File("TempCoaches.txt");
        PrintWriter tempFileWriter = new PrintWriter(new FileWriter(tempFile));

        GenericValue<Object> attribute_to_replace = new GenericValue<>();
        GenericValue<Object> replacement_value = new GenericValue<>();

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

        scannner.close();

        try {

            Scanner coachScanner = new Scanner((new File("Coaches.txt")));

            while (coachScanner.hasNextLine()) {

                if (coachScanner.nextLine() != trn) {
                    tempFileWriter.write(this.trn + " ");
                    tempFileWriter.write(this.full_name + " ");
                    tempFileWriter.write(
                            this.date_of_birth.GetDay() + "/" +
                                    this.date_of_birth.GetMonth() + "/" +
                                    this.date_of_birth.GetYear());
                    tempFileWriter.write(this.gender + " ");
                    tempFileWriter.write(this.employment + " ");
                    tempFileWriter.write(this.date_separation + " ");
                    tempFileWriter.write(this.commission_rate + " " + "\n");
                    continue;
                }
                String line = scannner.nextLine();
                line = line.replace(attribute_to_replace.getValue().toString(), "sdsdsd");
                tempFileWriter.write(line);

            }

            tempFileWriter.close();
            coachScanner.close();

            tempFile.renameTo(originalFile);
            originalFile.delete();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
