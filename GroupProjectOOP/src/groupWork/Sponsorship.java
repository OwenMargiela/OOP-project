package groupWork;

import java.util.*;
import java.io.*;

public class Sponsor {
    private String sponsorName;
    private String athleteName;
    private double amount;
   
    //default constructor
    public Sponsor() {
        sponsorName = "";
        athleteName = "";
        amount = 0;
    }

    //primary constructor
    public Sponsor(String sponsorName, String athleteName, double amount) {
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
    
    //add sponsorship
    public void AddSponsor()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the name of the Sponsor: ");
    	String name = in.nextLine();
    	
    	System.out.println("Enter the name of the athlete associated with the Sponsor: ");
    	String athName = in.nextLine();
    	
    	System.out.println("Enter the amount of money that the Sponsor covers: ");
    	double money = in.nextDouble();
    	
    	//opening file 
    	try {
    		FileWriter file = new FileWriter("SponsorList.txt", true);
    		file.write(name + " ");
    		file.write(athName + " ");
    		file.write(money + " ");
    		file.close();

    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}

    	
    }

   
}
