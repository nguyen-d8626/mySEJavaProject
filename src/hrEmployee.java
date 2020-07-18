
//subclass HR that inherits Employee and Submission
import java.time.LocalDate;

public class hrEmployee extends Employee implements Submission{
	private int priviledge;
	private String status;
	
	public hrEmployee(String fName, String lNAme, int employeeNumber, LocalDate dob, String address, String phoneNum,
			String role, double salary, String officialID) {
		super(fName, lNAme, employeeNumber, dob, address, phoneNum, role, salary, officialID);
		priviledge = 2;
	}

	@Override
	public String updateStatus() {
		status = "submitted";
		return status;
		
	}

	
	
	
	

}