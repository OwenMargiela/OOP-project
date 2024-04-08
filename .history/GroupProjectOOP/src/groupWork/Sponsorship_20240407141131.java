package groupWork;

import java.util.List;
import java.util.ArrayList;

public class Sponsorship {
    private String sponsorName;
    private String athleteName;
    private double amount;

    public Sponsorship(String sponsorName, String athleteName, double amount) {
        this.sponsorName = sponsorName;
        this.athleteName = athleteName;
        this.amount = amount;
    }

    // Getters and setters
    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Method to print details of the sponsorship
    public void printDetails() {
        System.out.println("Sponsor Name: " + sponsorName);
        System.out.println("Athlete Name: " + athleteName);
        System.out.println("Amount: $" + amount);
    }
}
