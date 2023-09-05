package Assignment_04;

public  class CurrentAccount extends Account{

	public CurrentAccount(double balance, int accountNo) {
		super(balance,accountNo);
	}
	public void display() {
		System.out.println("Current Account Information: ");
		System.out.println("Balance: "+super.getbalance()+
				"\nAccount Number: "+super.getaccountNo());
		
	}
}
