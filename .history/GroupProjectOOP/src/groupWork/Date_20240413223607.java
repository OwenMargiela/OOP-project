package groupWork;

public class Date {
	private int day;
	private int month;
	private int year;

	// primary constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	// getters and setters
	public int GetDay() {
		return day;
	}

	public void SetDay(int day) {
		this.day = day;
	}

	public int GetMonth() {
		return month;
	}

	public void SetMonth(int month) {
		this.month = month;
	}

	public int GetYear() {
		return year;
	}

	public void SetYear(int year) {
		this.year = year;
	}

	// Display method
	public void Display() {
		System.out.println(day + "/" + month + "/" + year);
	}

}
