package oops;

public class Employee {

	String Name;
	int EmployeeID;
	public static int Salary = 25000;
	public static String CompanyName = "Ranosys";

	public Employee(String Name, int EmployeeID, int Salary) {

		this.Name = Name;
		this.EmployeeID = EmployeeID;
		this.Salary = Salary;

	}
	
	public Employee(String Name, int EmployeeID) {

		this.Name = Name;
		this.EmployeeID = EmployeeID;
		

	}

	public void PrintAll() {

		System.out.println(Name +" " + EmployeeID + " " + Salary + " " + CompanyName);
	}
	
	public void PrintName() {

		System.out.println("Name of Employee is: " + Name);
	}

	public void PrintEmployeeID() {

		System.out.println("Employee ID is: " + EmployeeID);
	}

	public int PrintSalary() {

		System.out.println("Employee Salary is: " + Salary);
		
		return Salary;
	}

}
