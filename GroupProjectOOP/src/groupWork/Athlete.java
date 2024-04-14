package groupWork;

import java.io.*;
import java.util.Scanner;

public class Athlete extends User{
	private int trn;
	private String fName;
	private String mName;
	private String lName;
	private String gender;
	private Date dateOfBirth;
	private float height;
	private float weight;
	private String nationality;
	private boolean affiClub;// Affiliated with club 
	private boolean affiSponsor;//Affiliated with a sponsor
	private Club club;
	
	//primary constructor
	public Athlete() {
		super();
		trn = 0;
		fName = " ";
		mName = " ";
		lName = " ";
		gender = " ";
		dateOfBirth = new Date();
		height = 0;
		weight = 0;
		nationality = " ";
		affiClub = false;
		affiSponsor = false;
		club = new Club();
	}
		
	//Getters and setters
	public int getTrn() {
		return trn;
	}


	public void setTrn(int trn) {
		this.trn = trn;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public boolean isAffiClub() {
		return affiClub;
	}


	public void setAffiClub(boolean affiClub) {
		this.affiClub = affiClub;
	}


	public boolean isAffiSponsor() {
		return affiSponsor;
	}


	public void setAffiSponsor(boolean affiSponsor) {
		this.affiSponsor = affiSponsor;
	}


	public Club getClub() {
		return club;
	}


	public void setClub(Club club) {
		this.club = club;
	}
	
	
	public void addAthlete()
	{
		try {
			String un, pw;
			int trn;
			String fName;
			String mName;
			String lName;
			String gender;
			float height;
			float weight;
			String nationality;
			Athlete a1 = new Athlete();
			int cc;
			String cn;
			Club c = new Club();
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the username assigned to the athlete: ");
			un = in.next();
			
			System.out.println("Enter the password assigned to the athlete: ");
			pw = in.next();
			
			System.out.println("Enter the trn of the athlete: ");
			trn = in.nextInt();
			
			System.out.println("Enter the first name of the athlete: ");
			fName = in.next();
			
			System.out.println("Enter the middle name of the athlete: ");
			mName = in.next();
			
			System.out.println("Enter the last name of the athlete: ");
			lName = in.next();
			
			System.out.println("Enter the gender of the athlete(M for male and F for female): ");
			gender = in.next();
			
			System.out.println("Enter the day that the athlete was born: ");
			int day = in.nextInt();

			System.out.println("Enter the month that the athlete was born: ");
			int month = in.nextInt();

			System.out.println("Enter the year that the athlete was born: ");
			int year = in.nextInt();
			
			System.out.println("Enter the height of the athlete : ");
			height = in.nextFloat();
			
			System.out.println("Enter the weight of the athlete : ");
			weight = in.nextFloat();
			
			System.out.println("Enter the nationality of the athlete : ");
			nationality = in.next();
			
			System.out.println("Is this athlete affliated with any club?:(true or false) ");
			String test = in.next();
			
			Date dob = new Date(day, month, year);
			
			if(test.equals("True") || test.equals("true"))
			{
				a1.setAffiClub(true);				
				System.out.println("Enter the code of the club that you are affiliated to : ");
				cc = in.nextInt();
				
				System.out.println("Enter the name of the club that you are affiliated to : ");
				cn = in.next();
				
				c.setClubCode(cc);
				c.setClubName(cn);
			}
			else {
				System.out.println("The athlete is not associated with a club");
			}
	
				
			FileWriter AssoFile = new FileWriter("AthleteList.txt" , true);
			AssoFile.write(un + " ");
			AssoFile.write(pw + " ");
			AssoFile.write(trn + " ");
			AssoFile.write(fName + " ");
			AssoFile.write(mName + " ");
			AssoFile.write(lName + " ");
			AssoFile.write(gender + " ");
			AssoFile.write(dob.GetDay() + " " + dob.GetMonth()  + " " + dob.GetYear() + " ");
			AssoFile.write(height + " ");
			AssoFile.write(weight + " ");
			AssoFile.write(nationality + " ");
			AssoFile.write(test + " ");
			
			
			if(test.equals("True") || test.equals("true")){
				AssoFile.write(c.getClubCode()+ " ");
				AssoFile.write(c.getClubName()+ " ");

			}
			
			AssoFile.write("\n");
			AssoFile.close();

			
		}
		catch(IOException e)
		{
			System.out.println("Error.This record could not be added to the file");
			e.printStackTrace();
		}
		
	}
	
	public void ViewAthlete()
	{
		userName = "";
		password = "";
		trn = 0;
		fName = " ";
		mName = " ";
		lName = " ";
		gender = " ";
		dateOfBirth = new Date();
		height = 0;
		weight = 0;
		nationality = " ";
		affiClub = false;
		affiSponsor = false;
		club = new Club();
		
		try {
			String un;
			String pw;
			int trN;
			String fn;
			String mn;
			String ln;
			String gen;
			int day;
			int month;
			int year;
			float h;//height
			float w;//weight
			String nat;
			String clob;
			
			Scanner athScanner = new Scanner(System.in);
			System.out.println("Enter the trn of the athlete that you want to view");
			int num = athScanner.nextInt();

			Scanner inFile = new Scanner(new File("AthleteList"));
			while(inFile.hasNext())
			{
				un = inFile.next();
				pw = inFile.next();
				trN = inFile.nextInt();
				fn = inFile.next();
				mn = inFile.next();
				ln = inFile.next();
				gen = inFile.next();
				day = inFile.nextInt();
				month = inFile.nextInt();
				year = inFile.nextInt();
				h = inFile.nextFloat();
				w = inFile.nextFloat();
				nat = inFile.next();
				clob = inFile.next();
				
				if(num == trN) {
					trn = trN;
					fName = fn;
					mName = mn;
					lName = ln;
					gender = gen;
					dateOfBirth = new Date(day, month, year);
					height = h;
					weight = w;
					nationality = nat;
				}
			}
			inFile.close();
			
			System.out.println("TRN: " + trn);
			System.out.println("First Name: " + fName);
			System.out.println("Middle Name: " + mName);
			System.out.println("Last Name: " + lName);
			System.out.println("Gender: " + gender);
			System.out.println("DOB: " + dateOfBirth);
			System.out.println("Height: " + height);
			System.out.println("Weight: " + weight);
			System.out.println("Nationality: " + nationality);

		}
		catch(FileNotFoundException e) {
			
		}
	}

}
