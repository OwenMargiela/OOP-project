package groupWork;

import java.io.*;
import java.util.*;

public class Admin extends User {
	public Admin() {
		super();
	}

	public void LogIn() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter administrators password: ");
		String pw = in.next();

		super.setPassword(pw);
	}

	public void AddAdmin() {
		try {
			FileWriter AdminFile = new FileWriter("Adminpassword.txt", true);
			AdminFile.write("password123" + " ");
			AdminFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
