package groupWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Club {
	private int clubCode;
	private String clubName;
	private String clubColour;
	private int totalMembership;
	private String president;
	private Coach headCoach;
	private Association associ;
	
	//default constructor
	public Club()
	{
		clubCode = 0;
		clubName = " ";
		clubColour = " ";
		totalMembership = 0;
		president = " ";
		//headCoach = hc;
		associ = new Association();
	}
	
	//primary constructor
	public Club(int cc, String cn, String colour, int members, String pres,/* Coach hc,*/ Association asso)
	{
		clubCode = cc;
		clubName = cn;
		clubColour = colour;
		totalMembership = members;
		president = pres;
		//headCoach = hc;
		associ = asso;
	}
	
	//getters and setters
	public int GetTotalMembership() {
		return totalMembership;
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

	public Coach GetHeadCoach() {
		return headCoach;
	}

	public void SetHeadCoach(Coach headCoach) {
		this.headCoach = headCoach;
	}
	
	
	//methods
	public void addClub()
	{
		try {
			int cc, members, idAsso;
			String cn, colour, pres;
			Coach hc;
			Association asso = new Association();
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the code of the club: ");
			cc = in.nextInt();
			
			System.out.println("Enter the name of the club: ");
			cn = in.next();
			
			System.out.println("Enter the colour of the club: ");
			colour = in.next();
			
			System.out.println("Enter the number of persons in the club: ");
			members = in.nextInt();
			
			System.out.println("Enter the name president of the club: ");
			pres = in.next();
			
			System.out.println("Enter the id number of association that the club is related to: ");
			idAsso = in.nextInt();
			
			System.out.println("Enter the address of the association that the club is related to: ");
			String addrAsso = in.next();
			
			System.out.println("Enter the number of clubs in the association that the club is related to: ");
			int nocAsso = in.nextInt();
			
			
			asso.SetIdNum(idAsso);
			asso.SetAddress(addrAsso);
			asso.SetNumOfClubs(nocAsso);
			
			
			Club obj = new Club(cc, cn, colour, members, pres, asso);
			
			FileWriter AssoFile = new FileWriter("ClubList.txt" , true);
			AssoFile.write(cc + " ");
			AssoFile.write(cn + " ");
			AssoFile.write(colour + " ");
			AssoFile.write(members + " ");
			AssoFile.write(pres + " ");
			AssoFile.write(asso.GetIdNum() + " " + asso.GetAddress() + " " + asso.GetNumOfClubs());
			AssoFile.write("\n");
			AssoFile.close();

			
		}
		catch(IOException e)
		{
			System.out.println("Error.This record could not be added to the file");
			e.printStackTrace();
		}	
	
	}

}
