package ques_03;
import java.util.Scanner;
public class MyJavaLoFatBurger extends OrderingSystem {
public static double totalSales;
	public MyJavaLoFatBurger(String item, int salesCount) {
		super(item, salesCount);
	}
public static void main(String []args) {
	int k=0;
	Scanner sc=new Scanner(System.in);
	OrderingSystem os=new OrderingSystem("null",0);
	System.out.println("Choose a group:\n1.Entree: \n1.Tofu Burger \t\t$3.49 \n2.Cajun Chicken \t$4.59"
			+ " \n3.Buffalo Wings \t$3.99 \n4.Rainbow Fillet \t$2.99 \n********** \n2.Side Dish: "
			+ "\n1.Rice Cracker \t\t$0.79 \n2.No-Salt Fries \t$0.69 \n3.Zucchini \t\t$1.09 "
			+ "\n4.Brown Rice \t\t$0.59 \n********** \n3.Drink: \n1.Cafe Mocha \t\t$1.99 "
			+ "\n2.Cafe Latte \t\t$1.99 \n3.Espresso \t\t$2.49 \n4.Oolong Tea \t\t$0.99 \n**********");
	
	do {
		int j=sc.nextInt();
		System.out.println("Enter quantity: ");
		int q=sc.nextInt();
	if(j==1) {
		System.out.println("Choose an Entree");
		 k=sc.nextInt();
		System.out.println("Item\tSales Count\tTotal");
	totalSales+=os.Entree(k,q);}
	else if(j==2) {
		System.out.println("Choose a SideDish");
		k=sc.nextInt();
		System.out.println("Item\t\tSales Count\t\tTotal");
		totalSales+=os.SideDish(k,q);}
	else if(j==3) {
		System.out.println("Choose a Drink");
		k=sc.nextInt();
		System.out.println("Item\tSales Count\tTotal");
		totalSales+=os.Drink(k,q);}
	else {System.out.println("Choice out of bounds.");
	break;}
	}while(k>0&&k<5);
	System.out.println("Today's Total sales: $"+totalSales);
}
}
