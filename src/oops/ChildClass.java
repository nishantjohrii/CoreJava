package oops;

public class ChildClass extends Person {

	String Profession;

	public ChildClass() {

	}

	public ChildClass(String Name, int Age, String Profession) {

		super(Name, Age);
		this.Profession = Profession;

	}

	public void print() {

		System.out.println("Inside child");
	}

	public void display() {

		System.out.println("Inside Child");
	}
}
