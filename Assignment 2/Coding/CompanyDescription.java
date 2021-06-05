package Assignment2;

public abstract class CompanyDescription {		//2.1 Inheritance
												//2.4 Abstraction
	
	private String companyName;

	public CompanyDescription() {
		setName("Wedding By Design");
		printDescription();
		printSlogan();
		printCompany();
	}
	
	public void setName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return companyName;
	}

	public String printDescription() {
		return "Weddings by Design is a bridal and event planning company,"
				+ "\nFounded in 2000 and locate at Penang."
				+ "\nWe offers services that include "
				+ "\nCultural weddings, Destination weddings and Social events.";
	}
	
	public String printSlogan() {
		return "Happily ever after begins here.";
	}
	
	public String printMission() {
		return "Connecting the right bride with the right Wedding Professional.";
	} 

	public void printCompany() {
		System.out.println("==========================================================\n");
		System.out.println(getName());
		System.out.println("\nDescription :\n" + printDescription());
		System.out.println("\n\nSlogan :\n" + printSlogan());
		System.out.println("\n\nMission :\n" + printMission());
	}
	
	public abstract void printInfo();		//2.2 Polymorphism - method printInfo
}
