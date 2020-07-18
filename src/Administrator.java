
//subclass Administrator that inherits Employee and Submission

import java.time.LocalDate;
import java.util.*;

public class Administrator extends Employee implements Submission{
	private int priviledge;
	private String status;
	
	public Administrator(String fName, String lNAme, int employeeNumber, LocalDate dob, String address, String phoneNum,
			String role, double salary, String officialID) {
		super(fName, lNAme, employeeNumber, dob, address, phoneNum, role, salary, officialID);
		priviledge = 1;
	}

	@Override
	public String updateStatus() {
		System.out.println("Manually reject? y/n");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		if (!answer.equalsIgnoreCase("y")&&!answer.equalsIgnoreCase("n")) {
			System.out.println("Please enter y for yes, n for no: ");
			answer = input.nextLine();
		}
		else {
			if(answer.equalsIgnoreCase("y")) {
				status = "rejected";
			}
			else {
				status = null;
			}
		}
		return status;
	}
	
	

}
