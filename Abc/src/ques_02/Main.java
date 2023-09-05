package ques_02;
import java.util.Scanner;
public class Main {
public void main(String[] args) {
	Person[] p= new Person[2];
	p[0]=new Person("Aliya","030345612","house#2,Street#13,Islamabad");//to input values by self.
	p[1]=new Person("Hania","030345643","house#202,Street#1,Rawalpindi");
	System.out.println("Enter 1 for Add new person,\n2 for Delete person,\n3 for Modify,"
			+ "\n4 for Search a person,\n 5 for Display ");
	System.out.println("Enter your choice");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	System.out.println ("Enter an index to ");
	int index=sc.nextInt();
	if(ch==1) {
		Person[]p1=new Person[p.length];
		p1[p.length].AddNewPer();
		p=p1;
	}
	else if(ch==2) {p[index].DelNewPer();}
	else if(ch==3) {p[index].ModifyPer();}
	else if(ch==4) {p[index].SearchPer();}
	else if(ch==5) {
		for(int i=0;i<p.length;i++) {
		p[i].DisplayPer();
		}}
	PersonalFriend pf[]=new PersonalFriend[2];
	pf[0]=new PersonalFriend("Hadia", "0345673577", "Islamabad", "Sketching", " Girl");
	pf[0].DisplayPer();
	pf[1].AddNewPer();
	pf[1].DisplayPer();
	BusinessAssociate[] ba=new BusinessAssociate[2];
	ba[0]=new BusinessAssociate("Hadia", "0345673577", "Islamabad","Industry","034527488","Blue Area Islamabad");
	ba[0].DisplayPer();
	ba[1].AddNewPer();
	ba[1].DisplayPer();
		}
		
	}

