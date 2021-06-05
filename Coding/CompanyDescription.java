package Assignment1;

public class CompanyDescription {
	
	private String name;
	
	public CompanyDescription(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String printInfo() {
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
	
	public String toString() {
		return getName() + 
				"\n\nDescription :\n" + printInfo() + 
				"\n\nSlogan :\n" + printSlogan() +
				"\n\nMission :\n" + printMission();
		
				
	}
}
