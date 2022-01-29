package oops;

public class RunnerClass {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.Name = "Sachin";
		emp1.EmployeeID = 1111;
		emp1.Salary = 20000;

		Employee emp2 = new Employee();
		emp2.Name = "Abhimanyu";
		emp2.EmployeeID = 1112;
		emp2.Salary = 18000; */
		
		Employee.CompanyName = "Ranosys Technologies";
		
		Employee emp1 = new Employee("Sachin", 1111);
		Employee emp2 = new Employee("Abhimanyu", 1112);
		Employee emp3 = new Employee("Rahul", 1113);
		
		emp1.PrintAll();
		emp2.PrintAll();
		emp3.PrintAll();
		
		
		Person  per = new Person();
		
		ChildClass child1 = new ChildClass();
		//child1.display();
		//child1.print();
		
		ChildClass child2 = new ChildClass("Nishant", 30, "Software Engineer");
		
		child1.display();
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(10, 20);
		obj.sum(12, 15, 13);
		
		BankClass bank = new ICICIBank();
		bank.CheckBalance();
		
		EncapsulationExample name = new EncapsulationExample();
		
		name.setFirstName("Nishant");
		System.out.println(name.getFirstName());
	}

}
