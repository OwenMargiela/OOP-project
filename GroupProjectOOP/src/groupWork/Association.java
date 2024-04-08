package groupWork;

import java.io.*;
import java.util.*;

public class Association {
	private int idNum;
	private String address;
	private int numOfClubs;
	public int counter;
	
	public Association()
	{
		idNum = 0;
		address = " ";
		numOfClubs = 0;

	}
	
	//primary constructor
	public Association(int idNum, String address, int numOfClubs)
	{
		this.idNum = idNum;
		this.address = address;
		this.numOfClubs = numOfClubs;
	}
	
	public int GetIdNum() {
		return idNum;
	}

	public void SetIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String GetAddress() {
		return address;
	}

	public void SetAddress(String address) {
		this.address = address;
	}

	public int GetNumOfClubs() {
		return numOfClubs;
	}

	public void SetNumOfClubs(int numOfClubs) {
		this.numOfClubs = numOfClubs;
	}

	//methods
	public void addAssociation()
	{
		
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
		//numOfClubs = 0;
		
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
					//numOfClubs = noc;//numOfClubs
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
	

	public void DeleteAssociation() {
		// This method
	        // We pass in the the file of the record we want to delete
	        // Writes the contents of the first file to the second file
	        // The record we wish to delete is not added to the new file
			Scanner readerin = new Scanner(System.in);
	
			
			System.out.println("Enter the ID number of the record that you would like to delete");
			String identifier/*id number being deleted*/ = readerin.next();
			
	        File original = new File("AssociationList.txt");
	        File temporaryFile = new File("Temp" + "AssociationList.txt");
	
	        try {
	        	
	            FileWriter tempFileWriter = new FileWriter(temporaryFile, true);
	            try {
	            	 BufferedReader coachFileScanner = new BufferedReader((new FileReader(original)));
	
	            	            String line;
	
	            	            while ((line = coachFileScanner.readLine()) != null) {
	            	                // Gets a singular record in a file and places it into an array

	            	                // Eg 000 Andre Mason 29/1/2005 M 29/3/2015 0/0/0 20000.0
	            	                String[] parts = line.split(" ");
	
	            	                if (parts[0].equals(identifier)) {
	            	                    // In this case parts[0] == "000"
	            	                    // If its equal to the identifier, we dont write it to the new file, effectively
	            	                    // deleting it
	
	            	                    continue;
	            	                }
	
	            	                tempFileWriter.write(line + "\n");
	            	            }
	
	            	            tempFileWriter.close();
	            	            coachFileScanner.close();
	            	            // We delete the old file and make the temporary file the main file
	            	            original.delete();
	            	            File newFileName = new File("AssociationList.txt");
	            	            temporaryFile.renameTo(newFileName);
	            }
	            catch (FileNotFoundException e) {
	                e.printStackTrace();
	            }
	            
	           
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

	public void SingleReport()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the id number for the association that you want the report on: ");
		int id = in.nextInt();
		
		try {
			Scanner inFile = new Scanner(new File("AssociationList.txt"));
			while(inFile.hasNext())
			{
				int idN = inFile.nextInt();
				String addr = inFile.next();
				int noc = inFile.nextInt();
				
				if(id == idN) {
					idNum = idN;
					address = addr;
					numOfClubs = noc;
					break;
				}
			}
			
			inFile.close();
		
		}
		catch(FileNotFoundException e) {
			System.out.println("Error. Record not found");
			e.printStackTrace();
		}
		
		System.out.println("Association ID Number: " + idNum);
		System.out.println("Association Address: " + address);
		System.out.println("Number of Clubs in association: " + numOfClubs);
		
		try {
			Scanner iniFile = new Scanner(new File("ClubList.txt"));
			while(iniFile.hasNext())
			{
				int cc = iniFile.nextInt();
				String cn = iniFile.next();
				String colour = iniFile.next();
				int members = iniFile.nextInt();
				String pres = iniFile.next();
				int idN = iniFile.nextInt();
				String addr = iniFile.next();
				int noc = iniFile.nextInt();
				
				if(id == idN) {
					System.out.println("Club Name: " + cn);
					System.out.println("Club Code: " + cc);
					System.out.println("Club colour: " + colour);
					System.out.println("Club president: " + pres + " \n");
				}
			}
			
			iniFile.close();
		
		}
		catch(FileNotFoundException e) {
			System.out.println("Error. Record not found");
			e.printStackTrace();
		}
		
	}
	
	public void ReportAll()
	{
		try 
		{
			Scanner iFile = new Scanner(new File("AssociationList.txt"));
			while(iFile.hasNext())
			{
				int idN = iFile.nextInt();
				String addr = iFile.next();
				int noc = iFile.nextInt();
				
				idNum = idN;
				address = addr;
				numOfClubs = noc;
				
				System.out.println("Association ID Number: " + idNum);
				System.out.println("Association Address: " + address);
				System.out.println("Number of Clubs in association: " + numOfClubs);
				
				try {
					Scanner iniFile = new Scanner(new File("ClubList.txt"));
					while(iniFile.hasNext())
					{
						int cc = iniFile.nextInt();
						String cn = iniFile.next();
						String colour = iniFile.next();
						int members = iniFile.nextInt();
						String pres = iniFile.next();
						int idn = iniFile.nextInt();
						String Addr = iniFile.next();
						int Noc = iniFile.nextInt();
						
						if(idNum == idn) {
							System.out.println("Club Name: " + cn);
							System.out.println("Club Code: " + cc);
							System.out.println("Club colour: " + colour);
							System.out.println("Club president: " + pres + " \n");
						}
					}
					
					iniFile.close();
				
				}
				catch(FileNotFoundException e) {
					System.out.println("Error. Record not found");
					e.printStackTrace();
				}
			}
			iFile.close();
							
		}
		catch(FileNotFoundException exx) {
			System.out.println("File was not found.");
			exx.printStackTrace();
		}
	}


}
