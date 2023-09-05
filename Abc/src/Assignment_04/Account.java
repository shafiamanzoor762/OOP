package Assignment_04;

public abstract class Account {
	private double balance;
	private int accountNo;
	public Account (double balance,int accountNo) {
		this.balance=balance;
		this.accountNo=accountNo;}
	public double getbalance() {
		return balance;}
	public double getaccountNo() {
		return accountNo;}
	public abstract void display();
}
