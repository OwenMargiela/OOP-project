package groupWork;

public class Club {
	private int clubCode;
	private String clubName;
	private String clubColour;
	private int totalMembership;
	private String president;
	private Coach headCoach;
	//association ???
	
	//primary constructor
	public Club(int cc, String cn, String colour, int members, String pres, Coach hc)
	{
		clubCode = cc;
		clubName = cn;
		clubColour = colour;
		totalMembership = members;
		president = pres;
		headCoach = hc;
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


	
	

}
