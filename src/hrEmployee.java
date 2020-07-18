import java.time.LocalDate;

public class hrEmployee extends Employee{
	private int priviledge;
	private int formID;
	
	public hrEmployee(String fName, String lNAme, int employeeNumber, LocalDate dob, String address, String phoneNum,
			String role, double salary, String officialID) {
		super(fName, lNAme, employeeNumber, dob, address, phoneNum, role, salary, officialID);
		priviledge = 2;
	}

	
	
	
	

}