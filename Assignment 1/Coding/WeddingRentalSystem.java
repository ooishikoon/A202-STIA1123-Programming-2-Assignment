package Assignment1;

import java.util.Scanner;

public class WeddingRentalSystem {
	
	static Scanner input = new Scanner(System.in);
	
	static int answer;
	
	public static void main(String[] args) {
		
		System.out.println("\tWELCOME TO WEDDING BY DESIGN WEDDING RENTAL");
		System.out.println("==========================================================");
		
		//print Company Description
		CompanyDescription info = new CompanyDescription("Wedding By Design");
		System.out.println(info);
		
		System.out.println("\n==========================================================");
		System.out.println("\t\t\tMENU");
		System.out.println("\n1 Customer");
		System.out.println("2 Admin");
		
		
		System.out.print("\nPlease enter 1 for customer and 2 for admin : ");
		int menuOption = input.nextInt();
		
		if(menuOption == 1) {
			System.out.println("\n==========================================================");
			System.out.println("\nIt is a wonderful chance for us to service you. \nThanks for choosing us! \nLet's start to choose your wedding venue!\n");
			Sales s = new Sales(150, 2);
			System.out.println(s);
			System.out.println(s.receipt());
		} 	//end customer option
		
		else if(menuOption == 2) {
			System.out.println("\n==========================================================");
			System.out.println("\t\t\tAdmin Interface");
			
			System.out.print("Log In : ");
			String username = input.next();input.nextLine();
			System.out.print("Password : ");
			String password = input.nextLine(); 
			
			if((username.equals("jasley")) && (password.equals("wrs2000"))) {
				System.out.println("\nLog In Successful!");
				System.out.println("\n==========================================================");
				
				String loginName = "Jasley";
				System.out.println("\nName of admin log in now : " + loginName);
				String position = "Official Financial";
				System.out.println("Position\t\t : " + position); 
				
				do {
					System.out.println("\n1 Inventory \n2 Employee Management \n3 Finance \n4 Advertisement & Marketing");
					System.out.print("\nPlease choose the option you want from above : ");
					int option = input.nextInt();
					
					if(option == 1) {
						InventoryManagement i = new InventoryManagement(15,8);
						System.out.println(i.stockCount());
					}
					
					if(option == 2) {
						EmployeeManagement emp = new EmployeeManagement();
						System.out.println(emp.salaryStatement());
					}
					
					if(option == 3) {
						Finance f = new Finance(5332.12,2292.1);
						System.out.println(f.monthlyStatement());		
					}
					
					if(option == 4) {
						AdvertisementAndMarketing aa = new AdvertisementAndMarketing("Church Abc", "Church Def");
						System.out.println(aa);
					}
					
					if(option > 5) {
						System.out.println("\nWrong input! Please try again." + "\nThe system is exiting now...");
						System.exit(0);
					}
					
					System.out.println("\nDo you want to go to menu?");
					System.out.print("Please enter an integer or -1 to stop: ");
		     		answer = input.nextInt();
				} while(answer != -1);	//end do while
			}	// end if username & password are correcct
			
			else {
				System.out.println("\nWrong username or password! Please try again!" + "\nThe system is exiting now...");
				System.exit(0);
			}
		
		}	//end adminOption
		
		else {
			System.out.println("Invalid input. Please enter again." + "\nThe system is exiting now...");
			System.exit(0);
		}	//end menuOption
		
	}	// end main class

}	//end WRS
