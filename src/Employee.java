
import java.time.*;

public abstract class Employee {
	private String fName;
	private String lName;
	private int employeeNumber;
	private LocalDate dob;
	private String address;
	private String phoneNum;
	private String role;
	private double salary;
	private String officialID;
	
	//constructor
	public Employee(String fName, String lNAme, int employeeNumber, LocalDate dob, String address, String phoneNum,
			String role, double salary, String officialID) {
		
		this.fName = fName;
		this.lName = lNAme;
		this.employeeNumber = employeeNumber;
		this.dob = dob;
		this.address = address;
		this.phoneNum = phoneNum;
		this.role = role;
		this.salary = salary;
		this.officialID = officialID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlNAme() {
		return lName;
	}

	public void setlNAme(String lNAme) {
		this.lName = lNAme;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficialID() {
		return officialID;
	}

	public void setOfficialID(String officialID) {
		this.officialID = officialID;
	}
	
	
	@Override
	public String toString() {
		String line = "/n";
		return "Name" + fName + " " + lName
				+line + "Employee Number: " +employeeNumber
				+line + "Date of Birth: " + dob
				+line + "Address: " + address
				+line + "Phone: " + phoneNum
				+line + "Role: " +role
				+line + "Salary: " + salary;
	}

	
	
	
}
