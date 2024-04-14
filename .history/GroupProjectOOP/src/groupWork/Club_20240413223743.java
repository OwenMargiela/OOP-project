package groupWork;

import java.io.*;
import java.util.Scanner;

public class Club extends User {
	private int clubCode;
	private String clubName;
	private String clubColour;
	private int totalMembership;
	private String president;
	private String headCoach;
	private Association associ;

	// default constructor
	public Club() {
		super();
		clubCode = 0;
		clubName = " ";
		clubColour = " ";
		totalMembership = 0;
		president = " ";
		headCoach = " ";
		associ = new Association();
	}

	// primary constructor
	public Club(String userName, String password, int cc, String cn, String colour, int members, String pres, String hc,
			Association asso) {
		super(userName, password);
		clubCode = cc;
		clubName = cn;
		clubColour = colour;
		totalMembership = members;
		president = pres;
		headCoach = hc;
		associ = asso;
	}

	// getters and setters

	public int GetTotalMembership() {
		return totalMembership;
	}

	public int getClubCode() {
		return clubCode;
	}

	public void setClubCode(int clubCode) {
		this.clubCode = clubCode;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubColour() {
		return clubColour;
	}

	public void setClubColour(String clubColour) {
		this.clubColour = clubColour;
	}

	public void SetTotalMembership(int totalMembership) {
		this.totalMembership = totalMembership;
	}

	public String GetPresident() {
		return president;
	}

	public void SetPresident(String president) {
		this.president = president;
	}

	public String GetHeadCoach() {
		return headCoach;
	}

	public void SetHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public Association getAssoci() {
		return associ;
	}

	public void setAssoci(Association associ) {
		this.associ = associ;
	}

	// methods
	public void AddClub() {
		try {
			int cc, members, idAsso;
			String cn, colour, pres;
			String hc, un, pw;
			Association asso = new Association();

			Scanner in = new Scanner(System.in);

			System.out.println("Enter the code of the club: ");
			cc = in.nextInt();

			System.out.println("Enter the name of the club: ");
			cn = in.next();

			System.out.println("Enter the user name assigned to the club: ");
			un = in.next();

			System.out.println("Enter the password assigned to the club: ");
			pw = in.next();

			System.out.println("Enter the colour of the club: ");
			colour = in.next();

			System.out.println("Enter the number of persons in the club: ");
			members = in.nextInt();

			System.out.println("Enter the name president of the club: ");
			pres = in.next();

			System.out.println("Enter the trn of the coach of the club: ");
			String coaTrn = in.next();

			System.out.println("Enter the head Coach of the club is: ");
			hc = in.next();

			System.out.println("Enter the id number of association that the club is related to: ");
			idAsso = in.nextInt();

			System.out.println("Enter the address of the association that the club is related to: ");
			String addrAsso = in.next();

			System.out.println("Enter the number of clubs in the association that the club is related to: ");
			int nocAsso = in.nextInt();

			Association a1 = new Association();

			asso.SetIdNum(idAsso);
			asso.SetAddress(addrAsso);
			asso.SetNumOfClubs(nocAsso);

			Club obj = new Club(un, pw, cc, cn, colour, members, pres, hc, asso);

			FileWriter AssoFile = new FileWriter("ClubList.txt", true);
			AssoFile.write(cc + " ");
			AssoFile.write(un + " ");
			AssoFile.write(pw + " ");
			AssoFile.write(cn + " ");
			AssoFile.write(colour + " ");
			AssoFile.write(members + " ");
			AssoFile.write(pres + " ");
			AssoFile.write(hc + " ");
			AssoFile.write(asso.GetIdNum() + " " + asso.GetAddress() + " " + asso.GetNumOfClubs());
			AssoFile.write("\n");
			AssoFile.close();

		} catch (IOException e) {
			System.out.println("Error.This record could not be added to the file");
			e.printStackTrace();
		}

	}

	public void ViewClub() {
		userName = "";
		password = "";
		clubCode = 0;
		clubName = "";
		clubColour = "";
		totalMembership = 0;
		president = "";
		headCoach = "";
		Club c = new Club();
		associ = new Association();

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter the code for club that you want to view: ");
		int code = inp.nextInt();

		int cc;
		String cn, un, pw;
		String colour;
		int members;
		String pres;
		String hc;
		int idAsso;
		String addrAsso;
		int nocAsso;

		try {
			Scanner FileIn = new Scanner(new File("ClubList.txt"));
			while (FileIn.hasNext()) {
				un = FileIn.next();
				pw = FileIn.next();
				cc = FileIn.nextInt();
				cn = FileIn.next();
				colour = FileIn.next();
				members = FileIn.nextInt();
				pres = FileIn.next();
				hc = FileIn.next();
				idAsso = FileIn.nextInt();
				addrAsso = FileIn.next();
				nocAsso = FileIn.nextInt();

				if (cc == code) {
					associ.SetIdNum(idAsso);
					associ.SetAddress(addrAsso);
					associ.SetNumOfClubs(nocAsso);
					associ.setUserName(un);
					associ.setPassword(pw);

					clubCode = cc;
					clubName = cn;
					clubColour = colour;
					totalMembership = members;
					president = pres;
					c.setAssoci(associ);
					break;
				}

			}
			FileIn.close();

			System.out.println("Club Code: " + clubCode);
			System.out.println("Club Name: " + clubName);
			System.out.println("Club Colour: " + clubColour);
			System.out.println("Total membership of Club: " + totalMembership);
			System.out.println("Club president : " + president);
			System.out.println("Club Association: " + associ.GetIdNum());

		} catch (FileNotFoundException e) {
			System.out.println("Error. This association could not be retrieved.");
			e.printStackTrace();
		}

	}

	public void SingleReport() {
		String addrAsso;
		int nocAsso;
		int cc, members, idAsso;
		String cn, colour, pres;
		String hc, un, pw;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the id code for the club that you want the report on: ");
		int Cc = in.nextInt();

		try {
			Scanner inFile = new Scanner(new File("ClubList.txt"));
			while (inFile.hasNext()) {
				un = inFile.next();
				pw = inFile.next();
				cc = inFile.nextInt();
				cn = inFile.next();
				colour = inFile.next();
				members = inFile.nextInt();
				pres = inFile.next();
				hc = inFile.next();
				idAsso = inFile.nextInt();
				addrAsso = inFile.next();
				nocAsso = inFile.nextInt();

				Association asso = new Association(un, pw, idAsso, addrAsso, nocAsso);

				if (cc == Cc) {
					clubCode = cc;
					clubName = cn;
					clubColour = colour;
					totalMembership = members;
					president = pres;
					headCoach = hc;
					associ = asso;
					break;
				}
			}

			inFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error. Record not found");
			e.printStackTrace();
		}

		System.out.println("Club Code: " + clubCode);
		System.out.println("Club Name: " + clubName);
		System.out.println("Club Colour: " + clubColour);
		System.out.println("Total membership of Club: " + totalMembership);
		System.out.println("Club president : " + president);
		System.out.println("Club Head Coach : " + headCoach);
		System.out.println("Club Association: " + associ.GetIdNum());

		try {
			Scanner iniFile = new Scanner(new File("AthleteList.txt"));
			while (iniFile.hasNext()) {
				int trn = iniFile.nextInt();
				String fName = iniFile.next();
				String mName = iniFile.next();
				String lName = iniFile.next();
				String gender = iniFile.next();
				int day = iniFile.nextInt();
				int month = iniFile.nextInt();
				int year = iniFile.nextInt();
				float height = iniFile.nextFloat();
				float weight = iniFile.nextFloat();
				String nationality = iniFile.next();
				String AffiClub = iniFile.next();
				int clubc = iniFile.nextInt();
				String name = iniFile.next();

				if (Cc == clubc) {
					System.out.println("Athlete trn: " + trn);
					System.out.println("Athlete First Name: " + fName);
					System.out.println("Athlete Middle Name: " + mName);
					System.out.println("Athlete Last Name: " + lName);
					System.out.println("Athlete Gender: " + gender);
					System.out.println("Athlete Date of birth: " + day + "/" + month + "/" + year);
					System.out.println("Athlete height: " + height);
					System.out.println("Athlete weight: " + weight);
					System.out.println("Athlete nationality: " + nationality);
					System.out.println("Is Athlete affiliated with a club: " + AffiClub);
					if (AffiClub.equals("True") || AffiClub.equals("true")) {

						System.out.println("Athlete club code: " + clubc);
						System.out.println("Athlete club name: " + name + " \n");
					}

					System.out.println("\n");

				}
			}

			iniFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error. Record not found");
			e.printStackTrace();
		}

	}

	public void ReportAll() {
		String addrAsso;
		int nocAsso;
		int cc, members, idAsso;
		String cn, colour, pres;
		String hc, un, pw;

		Scanner in = new Scanner(System.in);

		try {
			Scanner inFile = new Scanner(new File("ClubList.txt"));
			while (inFile.hasNext()) {
				un = inFile.next();
				pw = inFile.next();
				cc = inFile.nextInt();
				cn = inFile.next();
				colour = inFile.next();
				members = inFile.nextInt();
				pres = inFile.next();
				hc = inFile.next();
				idAsso = inFile.nextInt();
				addrAsso = inFile.next();
				nocAsso = inFile.nextInt();

				Association asso = new Association(un, pw, idAsso, addrAsso, nocAsso);

				clubCode = cc;
				clubName = cn;
				clubColour = colour;
				totalMembership = members;
				president = pres;
				headCoach = hc;
				associ = asso;

				System.out.println("Club Code: " + clubCode);
				System.out.println("Club Name: " + clubName);
				System.out.println("Club Colour: " + clubColour);
				System.out.println("Total membership of Club: " + totalMembership);
				System.out.println("Club president : " + president);
				System.out.println("Club Head Coach : " + headCoach);
				System.out.println("Club Association: " + associ.GetIdNum());

				try {
					Scanner iniFile = new Scanner(new File("AthleteList.txt"));
					while (iniFile.hasNext()) {
						int trn = iniFile.nextInt();
						String fName = iniFile.next();
						String mName = iniFile.next();
						String lName = iniFile.next();
						String gender = iniFile.next();
						int day = iniFile.nextInt();
						int month = iniFile.nextInt();
						int year = iniFile.nextInt();
						Date dob = new Date(day, month, year);
						float height = iniFile.nextFloat();
						float weight = iniFile.nextFloat();
						String nationality = iniFile.next();
						String AffiClub = iniFile.next();
						int clubc = iniFile.nextInt();
						String name = iniFile.next();

						System.out.println("Athlete trn: " + trn);
						System.out.println("Athlete First Name: " + fName);
						System.out.println("Athlete Middle Name: " + mName);
						System.out.println("Athlete Last Name: " + lName);
						System.out.println("Athlete Gender: " + gender);
						System.out.println("Athlete Date of birth: " + day + "/" + month + "/" + year);
						System.out.println("Athlete height: " + height);
						System.out.println("Athlete weight: " + weight);
						System.out.println("Athlete nationality: " + nationality);
						System.out.println("Is Athlete affiliated with a club: " + AffiClub);
						if (AffiClub.equals("True") || AffiClub.equals("true")) {

							System.out.println("Athlete club code: " + clubc);
							System.out.println("Athlete club name: " + name + " \n");
						}

						System.out.println("\n");

					}

					iniFile.close();

				} catch (FileNotFoundException e) {
					System.out.println("Error. Record not found");
					e.printStackTrace();
				}

			}

			inFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error. Record not found");
			e.printStackTrace();
		}

	}

}
