import java.time.LocalDate;

public class Administrator extends Employee{
	private int priviledge;
	
	public Administrator(String fName, String lNAme, int employeeNumber, LocalDate dob, String address, String phoneNum,
			String role, double salary, String officialID) {
		super(fName, lNAme, employeeNumber, dob, address, phoneNum, role, salary, officialID);
		priviledge = 1;
	}
	
	

}
