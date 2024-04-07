package groupWork;

public class Athlete {
	private int trn;
	private String fName;
	private String mName;
	private String lName;
	private char gender;
	private Date date_of_birth;
	private float height;
	private float weight;
	private String nationality;
	private boolean affiliated;
	private Club club;
	private Association association;
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
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
	public boolean isAffiliated() {
		return affiliated;
	}
	public void setAffiliated(boolean affiliated) {
		this.affiliated = affiliated;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public Association getAssociation() {
		return association;
	}
	public void setAssociation(Association association) {
		this.association = association;
	}



}
