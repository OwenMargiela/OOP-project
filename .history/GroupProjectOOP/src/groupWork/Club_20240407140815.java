package groupWork;

import java.util.ArrayList;
import java.util.List;

public class Club {
	private String clubCode;
	private String name;
	private String color;
	private int totalMembership;
	private String president;
	private String headCoach;
	private Association associatedAssociation;

	public Club(String clubCode, String name, String color, int totalMembership, String president, String headCoach,
			Association associatedAssociation) {
		this.clubCode = clubCode;
		this.name = name;
		this.color = color;
		this.totalMembership = totalMembership;
		this.president = president;
		this.headCoach = headCoach;
		this.associatedAssociation = associatedAssociation;
	}

	// Getters and setters
	public String getClubCode() {
		return clubCode;
	}

	public void setClubCode(String clubCode) {
		this.clubCode = clubCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTotalMembership() {
		return totalMembership;
	}

	public void setTotalMembership(int totalMembership) {
		this.totalMembership = totalMembership;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public Association getAssociatedAssociation() {
		return associatedAssociation;
	}

	public void setAssociatedAssociation(Association associatedAssociation) {
		this.associatedAssociation = associatedAssociation;
	}

	// Method to print details of the club
	public void printDetails() {
		System.out.println("Club Code: " + clubCode);
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Total Membership: " + totalMembership);
		System.out.println("President: " + president);
		System.out.println("Head Coach: " + headCoach);
		System.out.println("Associated Association: " + /* GetAssociation name} */"");
	}
}
