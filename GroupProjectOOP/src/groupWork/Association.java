package groupWork;

import java.io.*;
import java.util.*;

public class Association {
	private int idNum;
	private String address;
	private int numOfClubs;
	
	//methods
	public void addAssociation(int idNum, String address, int numOfClubs)
	{
		this.idNum = idNum;
		this.address = address;
		this.numOfClubs = numOfClubs;
		
		try {
			FileWriter AssoFile = new FileWriter("AssociationList.txt" , true);
			AssoFile.write(idNum + " ");
			AssoFile.write(address + " ");
			AssoFile.write(numOfClubs + "");
			AssoFile.write("\n");
			AssoFile.close();

			
		}
		catch(IOException e)
		{
			System.out.println("Error.This record could not be added to the file");
			e.printStackTrace();
		}
		
	}
	
	public void ViewAssociation()
	{		
		idNum = 0;
		address = "";
		numOfClubs = 0;
		try {
			Scanner FileIn = new Scanner(new File("AssociationList.txt"));
			while(FileIn.hasNext())
			{
				idNum = FileIn.nextInt();
				address = FileIn.next();
				numOfClubs = FileIn.nextInt();
				
				System.out.println("ID Number" + idNum);
				System.out.println("Address" + address);
				System.out.println("Number of Clubs in association" + numOfClubs);

				
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println("Error. User information could not be retrieved.");
			e.printStackTrace();
		}
	
	}
	
	public void DeleteAssociation()
	{
		
	}
	
	
	
	

}
