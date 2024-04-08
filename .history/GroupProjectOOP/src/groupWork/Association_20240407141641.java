package groupWork;

import java.io.*;
import java.util.*;

public class Association {
	private int idNum;
	private String address;
	private Club club;

	// methods
	public void addAssociation(int idNum, String address, int numOfClubs) {
		this.idNum = idNum;
		this.address = address;
		this.club = club;

		try {
			FileWriter AssoFile = new FileWriter("AssociationList.txt", true);
			AssoFile.write(idNum + " ");
			AssoFile.write(address + " ");
			AssoFile.write(numOfClubs + "");
			AssoFile.write("\n");
			AssoFile.close();

		} catch (IOException e) {
			System.out.println("Error.This record could not be added to the file");
			e.printStackTrace();
		}

	}

	public void ViewAssociation() {
		idNum = 0;
		address = "";
		// numOfClubs = 0;

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter the ID number of the association that you want to view: ");
		int id = inp.nextInt();

		int number;
		String addi;

		try {
			Scanner FileIn = new Scanner(new File("AssociationList.txt"));
			while (FileIn.hasNext()) {
				number = FileIn.nextInt();
				addi = FileIn.next();
				// numOfClubs = FileIn.nextInt();

				if (number == id) {
					idNum = number;
					address = addi;
					// numOfClubs = 0;
					break;
				}

				System.out.println("ID Number" + idNum);
				System.out.println("Address" + address);
				// System.out.println("Number of Clubs in association" + numOfClubs);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Error. This association could not be retrieved.");
			e.printStackTrace();
		}

	}

	public void DeleteAssociation() {

	}

}
