package groupWork;

import java.io.*;
import java.util.*;

public class Association {
	private int idNum;
	private String address;
	private int numOfClubs;
	//private Club club;
	
	//primary constructor
	public Association(int idNum, String address, int numOfClubs)
	{
		this.idNum = idNum;
		this.address = address;
		this.numOfClubs = numOfClubs;
	}
	
	//methods
	public void addAssociation()
	{
		/*
		this.idNum = idNum;
		this.address = address;
		this.club = club;
		*/
		
		try {
			int id;
			String addr;
			int noc;//numOfClubs
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the ID number of the Association: ");
			id = in.nextInt();
			
			System.out.println("Enter the address of the Association: ");
			addr = in.next();
			
			System.out.println("Enter the number of clubs in the Association: ");
			noc = in.nextInt();
			
			Association obj = new Association(id, addr, noc);
			
			FileWriter AssoFile = new FileWriter("AssociationList.txt" , true);
			AssoFile.write(id + " ");
			AssoFile.write(addr + " ");
			AssoFile.write(noc + "");
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
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the ID number of the association that you want to view: ");
		int id = inp.nextInt();
		
		int number;
		String addi;
		int noc;
		
		try {
			Scanner FileIn = new Scanner(new File("AssociationList.txt"));
			while(FileIn.hasNext())
			{
				number = FileIn.nextInt();
				addi = FileIn.next();
				noc = FileIn.nextInt();
				//numOfClubs = FileIn.nextInt();
				
				if(number == id) {
					idNum = number;
					address = addi;
					numOfClubs = noc;//numOfClubs
					break;
				}
								
			}
			FileIn.close();
			
			System.out.println("Association ID Number: " + idNum);
			System.out.println("Association Address: " + address);
			System.out.println("Number of Clubs in association: " + numOfClubs + "\n");

			
		}catch(FileNotFoundException e)
		{
			System.out.println("Error. This association could not be retrieved.");
			e.printStackTrace();
		}
		
	
	}
	
	
	public void DeleteAssociation()
	{
		Scanner readerin = new Scanner(System.in);
		
		System.out.println("Enter the ID number of the record that you would like to delete");
		int dIdNum/*id number being deleted*/ = readerin.nextInt();
		
		try {
			Scanner sInFile = new Scanner(new File("AssociationList.txt"));
			while(sInFile.hasNext())
			{
				idNum = sInFile.nextInt();
				address = sInFile.next();
				numOfClubs = sInFile.nextInt();
				
				if(dIdNum != idNum) {
					try {
						FileWriter sOutFile = new FileWriter("tempAssociationList.txt", false);
						sOutFile.write(idNum + " ");
						sOutFile.write(address + " ");
						sOutFile.write(numOfClubs + " ");
						sOutFile.close();

					}
					catch(IOException ex) {
						System.out.println("Error. This File could not be created.");
						ex.printStackTrace();
					}
				}
			}
			
			sInFile.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Error. This association record could not be deleted.");
			e.printStackTrace();
		}
		
		
		
		
	}
	

	public void addClubToAsso()
	{
		
	}
	
	public void SingleReport()
	{
		
	}
	
	public void ReportAll()
	{
		
	}
	

}
