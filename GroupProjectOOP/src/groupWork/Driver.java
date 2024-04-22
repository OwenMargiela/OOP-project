package groupWork;

import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String identifier;
		Scanner scanner = new Scanner(System.in);
		FileHandle filehandler = new FileHandle();
		User userRef;
		Association A1 = new Association();
		Athlete A = new Athlete();
		Club c1 = new Club();
		Coach co1 = new Coach();
		Sponsor s1 = new Sponsor();
		Admin obj = new Admin();
		obj.AddAdmin();
		int n = 0;
		int x = 0;

		do {
			System.out.print("\033[H\033[2J");  
			System.out.flush(); 
			Scanner in = new Scanner(System.in);

			System.out.println("1 - Administrator");
			System.out.println("2 - User");

			System.out.println("Enter the type of user that you are (1 or 2): ");
			int user = in.nextInt();

			System.out.print("\033[H\033[2J");  
			System.out.flush(); 

			switch (user) {
				case 1:
				do {
					userRef = new Admin();
					userRef.LogIn();
					String password = userRef.getPassword();

					System.out.print("\033[H\033[2J");   

					try {
						Scanner inFile = new Scanner(new File("Adminpassword.txt"));
						while (inFile.hasNext()) {
							String pw = inFile.next();
							if (pw.equals(password)) {
								Scanner inp = new Scanner(System.in);

								System.out.println("Choose an option from any of the 5 below \n");
								System.out.println("1 - Association");
								System.out.println("2 - Club");
								System.out.println("3 - Athlete");
								System.out.println("4 - Coach");
								System.out.println("5 - Sponsor");


								int option = inp.nextInt();

								System.out.print("\033[H\033[2J");  
								System.out.flush(); 

								switch (option) {
									case 1:
										System.out.println("Choose action: ");
										System.out.println("1 - Add Association: ");
										System.out.println("2 - Edit Association: ");
										System.out.println("3 - Delete Association: ");
										System.out.println("4 - Produce report for a single association : ");
										System.out.println("5 - Produce report for all associations: ");


										int action1 = inp.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 

										switch (action1) {
											case 1:
												A1.addAssociation();
												break;
											case 2:
												System.out.println("Enter Assciation ID: ");
												identifier = scanner.next();
												System.out.println("Enter edit replacement value: ");
												String replacmentValue = scanner.next();
												System.out.println("Enter value to be replacemend: ");
												String attributeToBeReplaced = scanner.next();
												try {
													filehandler.edit_record("AssociationList.txt",
															attributeToBeReplaced,
															replacmentValue, identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												break;
											case 3:
												A1.DeleteAssociation();
												break;
											case 4:
												A1.SingleReport();
												break;
											case 5:
												A1.ReportAll();
												break;
											default:
												System.out.println("Invalid input.");
												break;
										}

										
										break;

										
						

									case 2:
										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										System.out.println("Choose action: ");
										System.out.println("1 - Add Club: ");
										System.out.println("2 - Edit Club: ");
										System.out.println("3 - Delete Club: ");
										System.out.println("4 - Produce report for a single Club : ");
										System.out.println("5 - Produce report for all Club: ");

										int action2 = inp.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 

										switch (action2) {
											case 1:
												c1.AddClub();
												break;
											case 2:

												System.out.println("Enter Club code: ");
												identifier = scanner.next();
												System.out.println("Enter edit replacement value: ");
												String replacmentValue = scanner.next();
												System.out.println("Enter value to be replacemend: ");
												String attributeToBeReplaced = scanner.next();
												try {
													filehandler.edit_record("CoachList.txt", attributeToBeReplaced,
															replacmentValue, identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;
											case 3:

												System.out.println("Enter Club code: ");
												identifier = scanner.next();
												try {
													filehandler.deleteRecord("ClubList.txt", identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												

												break;
											case 4:
												c1.SingleReport();
												break;
											case 5:
												c1.ReportAll();
												break;
											default:
												System.out.println("Invalid input.");
												break;

										}
										
										break;

									case 3:
										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										System.out.println("Choose action: ");
										System.out.println("1 - Add Athlete: ");
										System.out.println("2 - Edit Athlete: ");
										System.out.println("3 - Delete Athlete: ");

										int action3 = inp.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										switch (action3) {
											case 1:
												A.addAthlete();
												break;

											case 2:
												System.out.println("Enter Athlete trn: ");
												identifier = scanner.next();
												System.out.println("Enter edit replacement value: ");
												String replacmentValue = scanner.next();
												System.out.println("Enter value to be replacemend: ");
												String attributeToBeReplaced = scanner.next();
												try {
													filehandler.edit_record("AthleteList.txt", attributeToBeReplaced,
															replacmentValue, identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;

											case 3:

												System.out.println("Enter Athlete trn: ");
												identifier = scanner.next();
												try {
													filehandler.deleteRecord("AthleteList.txt", identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;
											default:
												System.out.println("Invalid input");
												break;

										}
										break;

									case 4:
										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										System.out.println("Choose action: ");
										System.out.println("1 - Add Coach: ");
										System.out.println("2 - Edit Coach: ");
										System.out.println("3 - Delete Coach: ");

										int action4 = inp.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										switch (action4) {
											case 1:
												co1.addCoach();
												break;

											case 2:
												System.out.println("Enter Coach trn: ");
												identifier = scanner.next();
												System.out.println("Enter edit replacement value: ");
												String replacmentValue = scanner.next();
												System.out.println("Enter value to be replacemend: ");
												String attributeToBeReplaced = scanner.next();
												try {
													filehandler.edit_record("CoachList.txt", attributeToBeReplaced,
															replacmentValue, identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												break;

											case 3:

												System.out.println("Enter Coach trn: ");
												identifier = scanner.next();
												try {
													filehandler.deleteRecord("CoachList.txt", identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;
											default:
												System.out.println("Invalid input");
												break;
										}

										break;
									case 5:
										System.out.print("\033[H\033[2J");  
										System.out.flush(); 
										System.out.println("Choose action: ");
										System.out.println("1 - Add sponsor: ");
										System.out.println("2 - Edit sponsor: ");
										System.out.println("3 - Delete sponsor: ");

										int action5 = inp.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 

										switch (action5) {
											case 1:
												s1.AddSponsor();

												break;

											case 2:

												System.out.println("Enter Sponsor name: ");
												identifier = scanner.next();
												System.out.println("Enter edit replacement value: ");
												String replacmentValue = scanner.next();
												System.out.println("Enter value to be replacemend: ");
												String attributeToBeReplaced = scanner.next();
												try {
													filehandler.edit_record("SponsorList.txt", attributeToBeReplaced,
															replacmentValue, identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;

											case 3:
												System.out.println("Enter Sponsor name: ");
												identifier = scanner.next();
												try {
													filehandler.deleteRecord("SponsorList.txt", identifier);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}

												break;

										}
										break;

									default:
										System.out.println("Invalid input");

										break;

								}

							} else {
								x = 1;
							}
							break;
						}
						inFile.close();

						if (x == 1) {
							System.out.println("Incorrect password");
						}

					} catch (FileNotFoundException e) {
						System.out.println("This file does not exist");
						e.printStackTrace();
					}
					
				} while (x==1);
					
					break;
				case 2:
					Scanner userIn = new Scanner(System.in);

					System.out.println("What type of user are you?");
					System.out.println("1 - Association");
					System.out.println("2 - Club");
					System.out.println("3 - Athlete");

					int usr = userIn.nextInt();

					System.out.print("\033[H\033[2J");  
					System.out.flush(); 

					switch (usr) {
						case 1:
							userRef = new Association();
							userRef.LogIn();
							System.out.print("\033[H\033[2J");  
							System.out.flush(); 

							String userNam = userRef.getUserName();
							String passwrd = userRef.getPassword();

							try {
								String userNAME = "";
								String p = "";
								int idNum = 0;
								String address = "";
								int numOfClubs = 0;

								Scanner assoFile = new Scanner(new File("AssociationList.txt"));
								while (assoFile.hasNext()) {
									userNAME = assoFile.next();
									p = assoFile.next();
									idNum = assoFile.nextInt();
									address = assoFile.next();
									numOfClubs = assoFile.nextInt();

									if (userNAME.equals(userNAME) && p.equals(passwrd)) {
										Scanner assoIn = new Scanner(System.in);

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 

										System.out.println("Welcome Association.");
										System.out.println("Options are below.");
										System.out.println("1 - View Associations.");
										System.out.println("2 - View Clubs.");
										System.out.println("3 - View Athletes.");

										// input
										int options = assoIn.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush(); 

										switch (options) {
											case 1:
												A1.ViewAssociation();
												break;
											case 2:
												c1.ViewClub();
												break;
											case 3:
												A.ViewAthlete();
												break;
											default:
												System.out.println("Invalid input");
												break;

										}
									}
									break;

								}
								assoFile.close();
								if (userNAME.equals("") || p.equals("")) {
									System.out.println("User entered incorrect username or password");

								}

							} catch (FileNotFoundException e) {
								System.out.println("This file does not exist");
								e.printStackTrace();

							}

							break;
						case 2:
							userRef = new Club();
							userRef.LogIn();
							String un = userRef.getUserName();
							String pw = userRef.getPassword();

							try {
								String uname = "", pwrd = "";
								Scanner cFile = new Scanner(new File("ClubList.txt"));
								while (cFile.hasNext()) {
									uname = cFile.next();
									pwrd = cFile.next();

									if (uname.equals(un) && pwrd.equals(pw)) {
										Scanner cIn = new Scanner(System.in);

										System.out.println("Welcome Club.");
										System.out.println("Options are below.");
										System.out.println("View Associations.");
										System.out.println("View Clubs.");
										System.out.println("View Athletes.");

										int options = cIn.nextInt();
										System.out.print("\033[H\033[2J");  
										System.out.flush();

										switch (options) {
											case 1:
												A1.ViewAssociation();
												break;
											case 2:
												c1.ViewClub();
												break;
											case 3:
												A.ViewAthlete();
												break;
											default:
												System.out.println("Invalid input");
												break;

										}
									}
								}
								cFile.close();
								if (uname.equals("")|| pwrd.equals("")) {
									System.out.println("User entered incorrect username or password");

								}
							} catch (FileNotFoundException e) {
								System.out.println("This file does not exist");
								e.printStackTrace();

							}

							break;
						case 3:
							userRef = new Athlete();
							userRef.LogIn();
							String un1 = userRef.getUserName();
							String pw1 = userRef.getPassword();

							try {
								String uName = "", pwd = "";

								Scanner athFile = new Scanner(new File("AthleteList.txt"));
								while (athFile.hasNext()) {
									uName = athFile.next();
									pwd = athFile.next();

									if (un1.equals(uName) && pwd.equals(pw1)) {
										Scanner athIn = new Scanner(System.in);

										System.out.println("Welcome Athlete.");
										System.out.println("Options are below.");
										System.out.println("View Associations.");
										System.out.println("View Clubs.");
										System.out.println("View Athletes.");

										int options = athIn.nextInt();

										System.out.print("\033[H\033[2J");  
										System.out.flush();

										switch (options) {
											case 1:
												A1.ViewAssociation();
												break;
											case 2:
												c1.ViewClub();
												break;
											case 3:
												A.ViewAthlete();
												break;
											default:
												System.out.println("Invalid input");

										}

									}
									

								}
								athFile.close();

								if (uName.equals("") || pwd.equals("")) {
									System.out.println("User entered incorrect username or password");

								}

							} catch (FileNotFoundException e) {
								System.out.println("This file does not exist");
								e.printStackTrace();
							}
							break;

					}

					break;
				default:
					System.out.println("Invalid input");

					break;
			}

			System.out.println("Enter 1 if you wish to end program");
			n = in.nextInt();

		} while (n != 1);

		scanner.close();
	}

}
