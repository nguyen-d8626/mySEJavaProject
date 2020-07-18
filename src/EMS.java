//main 
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class EMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfEmployees =3 ;
		String fName;
		String lName;
		int employeeNumber;
		LocalDate dob;
		String address;
		String phoneNum;
		String role;
		double salary;
		String officialID;
		int privilege;
		boolean test = false;
		Employee[] allEmployee = new Employee[numOfEmployees];
		
		
		for(int i =0;i<numOfEmployees; i++) {
			System.out.println("Enter first name");
			Scanner input = new Scanner(System.in);
			fName = input.nextLine();
			
			System.out.println("Enter last name");
			lName = input.nextLine();
			
			employeeNumber = generateEmployeeNumber(allEmployee, i);
			
			System.out.println("Enter Date of Birth (ex: 2/29/2008)");
			dob = dateInput(input.nextLine());
			
			System.out.println("Enter address");
			address = input.nextLine();
			
			System.out.println("Enter phone number");
			phoneNum= input.nextLine();
			
			System.out.println("Enter role");
			role= input.nextLine();
			
			System.out.println("Enter official ID");
			officialID= input.nextLine();
			
			System.out.println("Enter salary");
			salary= input.nextDouble();
			
			
			while(!test)
			{
				try {
					System.out.println("Enter number according to privilege: Administrator: 1 \tHR Employee: 2\tOthers: 0");
					privilege = input.nextInt();
					//Loop to check a correct privilege is inserted
					while(privilege != 1 && privilege != 2 && privilege!=0)
					{
						System.out.println("Invalid entry. Enter 1 for Administrator, 2 for HR employee, and 0 for others: ");
						privilege = input.nextInt();
					}
					test = true;
				}
				catch (InputMismatchException mistake) {
					System.out.println("Wrong data type, please input a numeric value (1, 2, or 0)!");
					input.nextLine();
				}
			}
		}
		
	}
	
	
	
	//this method generates a random employee ID everytime a new employee is created
	public static int generateEmployeeNumber(Employee[] eArray, int i) {
		int randomID = 0;
		int lower =1;
		int upper = 100;
		int temp = 0;
		
		boolean test= false;
		while(!test)
		{
			try {
				temp = (int) (Math.random() * (upper - lower)) + lower;

				//ensure the newly generated ID is not in the database
				boolean idExisted= true;
				while(idExisted)
				{
					idExisted = false;
					for(int j = 0; j < i; j++)
					{
						if(temp == eArray[j].getEmployeeNumber())
						{
							idExisted = true;
						}
					}	
					if(idExisted)
					{
						temp = (int) (Math.random() * (upper - lower)) + lower;
					}
				}
				test = true;
			}
			catch (InputMismatchException mistake) {
				temp = (int) (Math.random() * (upper - lower)) + lower;
			}
		}
		
		randomID = temp;
		return randomID;
	}
	
	//this method format the date
	public static LocalDate dateInput(String userInput) {

	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
	    LocalDate date = LocalDate.parse(userInput, dateFormat);

	    return date ;
	}
	
	//this method displays the information in the database
	public static void displayResults(Employee[] emArray)
	{
		System.out.println("Employee Information:");
		for(int x = 0; x < emArray.length; x++)
		{
			System.out.println(emArray[x].toString());
		}
	}

}
