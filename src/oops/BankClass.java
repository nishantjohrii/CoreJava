package oops;

public abstract class BankClass {

	public abstract void CheckBalance();
	
	public abstract void depositMoney();
	
	public abstract void withdrawMoney();
	
	public void Welcome() {
		System.out.println("Welcome to BankClass");
	}
}
