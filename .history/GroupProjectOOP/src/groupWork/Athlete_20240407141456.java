package groupWork;

public class Athlete {
	private String trn;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private double height;
	private double weight;
	private String nationality;
	private Club club;
	private boolean sponsored;

	public Athlete(String trn, String firstName, String middleName, String lastName, String gender, Date dateOfBirth,
			double height, double weight, String nationality) {
		this.trn = trn;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.club = null; // Initially not affiliated with any club
		this.sponsored = false; // Initially not sponsored
	}

	// Getters and setters
	public String getTrn() {
		return trn;
	}

	public void setTrn(String trn) {
		this.trn = trn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public boolean isSponsored() {
		return sponsored;
	}

	public void setSponsored(boolean sponsored) {
		this.sponsored = sponsored;
	}

	// Method to print details of the athlete
	public void printDetails() {
		System.out.println("TRN: " + trn);
		System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Height: " + height + " cm");
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Nationality: " + nationality);
		if (club != null) {
			System.out.println("Club: " + club.getName());
		} else {
			System.out.println("Club: Unattached");
		}
		System.out.println("Sponsored: " + (sponsored ? "Yes" : "No"));
	}
}
