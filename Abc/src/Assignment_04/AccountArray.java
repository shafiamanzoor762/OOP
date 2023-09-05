package Assignment_04;
import java.util.Scanner;
public class AccountArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1 to Show  current"
				+ " Accout Detail or 2 for Saving Account Detail: ");
		int choice=sc.nextInt();
		if(choice==1) {
		Account crrac[]=new CurrentAccount[10];
		for(int i=0;i<10;i++){
		   System.out.println("Enter an Account no: ");
		   int accNo=sc.nextInt();
		   System.out.println("Enter balance: ");
		   double balnc=sc.nextDouble();
		crrac[i]=new CurrentAccount(balnc,accNo);}
		for(int j=0;j<10;j++){
			crrac[j].display();}
		}
		if(choice==2) {
		Account savac[]=new SavingAccount[10];
		for(int i=0;i<10;i++){
			   System.out.println("Enter an Account no: ");
			   int accNo=sc.nextInt();
			   System.out.println("Enter balance: ");
			   double balnc=sc.nextDouble();
		System.out.println("Enter interest Rate: ");
		double intrsR=sc.nextDouble();
		savac[i]=new SavingAccount(balnc,accNo,intrsR); }
		for(int i=0;i<10;i++){
			savac[i].display();}
		}
	}
}
