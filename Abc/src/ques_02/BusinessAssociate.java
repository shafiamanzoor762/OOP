package ques_02;
import java.util.Scanner;
public class BusinessAssociate extends Person{
	
	
	
		public String business;
		public String bContactNo;
		public String bEmailAddr;
		public BusinessAssociate(String name, String contact, String address,String business,
				String bContactNo,String bEmailAddr) {
			super(name, contact, address);
			this.business=business;
			this.bContactNo= bContactNo;
			this.bEmailAddr=bEmailAddr;
		}
		public String DisplayPer() {
		return super.DisplayPer()+"\nBusiness: "+business+"\nBusiness ContactNo"+bContactNo+"\nBusiness "
				+ "EmailAddr: "+bEmailAddr;
		}
		public void AddNewPer() {
			super.AddNewPer();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter busines: ");
			business=sc.nextLine();
			System.out.println("Enter business ContactNo: ");
			bContactNo=sc.nextLine();
			System.out.println("Enter business Email Address: ");
			bEmailAddr=sc.nextLine();
			}
	}

