package Assignment_04;
import java.util.Scanner;
public class DemoAccount{
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Account no: ");
		int accNo=sc.nextInt();
		System.out.println("Enter balance: ");
		double balnc=sc.nextDouble();
		Account cac=new CurrentAccount(balnc,accNo);
		cac.display();
		System.out.println("Enter interest Rate: ");
	   double intrsR=sc.nextDouble();
	   Account sac=new SavingAccount(balnc,accNo,intrsR);
	   sac.display();
 }
}
