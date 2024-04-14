package groupWork;

import java.util.*;

public class User {
	protected String userName;
	protected String password;

	// default constructor
	public User() {
		userName = "";
		password = "";
	}

	// primary constructor
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Getters and Setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void LogIn() {
		Scanner login = new Scanner(System.in);

		userName = "";
		password = "";

		System.out.println("Enter User Name: ");
		userName = login.next();

		System.out.println("Enter password: ");
		password = login.next();

	}

}
