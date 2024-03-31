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

}
