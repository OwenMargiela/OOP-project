package groupWork;

import java.io.*;
import java.util.*;

import GroupProjectOOP.GenericValue;

public class Coach {
    public String trn;
    public String full_name;
    public Date date_of_birth;
    public String gender;
    public Date employment;
    public Date date_separation;
    public float commission_rate;

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
            coachFile.write(this.date_of_birth + " ");
            coachFile.write(this.gender + " ");
            coachFile.write(this.employment + " ");
            coachFile.write(this.date_separation + " ");
            coachFile.write(this.commission_rate + " ");
            coachFile.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void edit_coach(int trn) {
        Scanner scannner = new Scanner(System.in);
        GenericValue<Object> attribute_to_replace = new GenericValue<>();
        GenericValue<Object> replacement_value = new GenericValue<>();
        System.out.println("Enter the attribute you wish to replace: ");

        // If the string contains a '/', we are dealing with a Date;
        // If the string contains a '.', we are dealing with a Decimal;
        // Everything else is a string;

        // This may be converted to a function
        String attributeInput = scannner.nextLine();
        if (!attributeInput.contains("/")) {
            attribute_to_replace.setValue(attributeInput);
        } else if (attributeInput.contains(".")) {
            float floatVal = scannner.nextFloat();
            attribute_to_replace.setValue(floatVal);

        } else {
            attribute_to_replace.setValue(Helper.dateMaker());
        }

        System.out.println("What do you wish to replace it with: ");

        if (scannner.hasNextLine() && !scannner.nextLine().contains("/")) {
            String line = scannner.nextLine();
            replacement_value.setValue(line);
        } else if (scannner.hasNextFloat()) {
            float floatVal = scannner.nextFloat();
            replacement_value.setValue(floatVal);

        } else {
            replacement_value.setValue(Helper.dateMaker());
        }

        // This should be converted to a while to reprompt the user

        if (attribute_to_replace.getValue().getClass() != replacement_value.getValue().getClass()) {
            System.out.println("Elements are not of the same type.");
        }

        try {

            Scanner coachScanner = new Scanner((new File("Coaches.txt")));

            while (coachScanner.hasNextLine()) {
                if (coachScanner.nextInt() != trn) {
                    continue;
                }
                String line = scannner.nextLine();
                line = line.replace(attribute_to_replace.getValue().toString(), "sdsdsd");
                break;

            }

            coachScanner.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        scannner.close();

    }

}
