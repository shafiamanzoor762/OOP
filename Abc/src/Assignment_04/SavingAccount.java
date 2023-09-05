package Assignment_04;

public class SavingAccount extends Account{
private double interestRate;
	public SavingAccount(double balance, int accountNo,
			double interestRate) {
		super(balance, accountNo);
		this.interestRate=interestRate;
	}
public void display() {
	System.out.println("Saving Account Information: ");
	System.out.println("Balance: "+super.getbalance()+
			"\nAccount Number: "+super.getaccountNo()
			+"\ninterest Rate: "+interestRate);
}
}
