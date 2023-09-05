package ques_02;
import java.util.Scanner;
public class Person {
		public String name;
		public String contact;
		public String address;
		public Person p[];
		Scanner sc=new Scanner(System.in);
		public Person( String name,String contact,String address) {
			this.name=name;
			this.contact=contact;
			this.address=address;
		}
		public void insertPer(Person per){
			if(p==null) {
			p=new Person[]{per};}
			Person[] temp = new Person[p.length+1];
			for(int i=0;i<p.length;i++) {
				temp[i]=p[i];
			}
			temp[p.length]=per;
			temp=p;
		}
	public void DelNewPer(){
		System.out.println("Delete Person");
		System.out.print("Enter Person name: ");
		String nam = sc.nextLine();
		boolean found = false;
		Person[] temp = new Person[p.length-1];
		int temp_index = 0;
		for (int index = 0; index < p.length; index++) {
			if(p[index].getName().compareToIgnoreCase(name) == 0)
			{
				found = true;
			}
			else 
			{
				temp[temp_index++]=p[index];
			}
		}
		if(found)
		{
			p = temp;
		}
		else {
			System.out.println("Name: "+nam+" not found!");
		}
		
	}
		
		
	private String getName() {
		
		return this.name;
	}

	public void ModifyPer(){
		System.out.println("what you want to change?\n For Name enter 1,\n For Contact enter 2"
				+" or For Address enter 3:");
		int ch=sc.nextInt();
		System.out.println("Enter an index to any change from: 0 to "+(p.length-1));
		int i=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter name: ");
			String nam=sc.nextLine();
		ChangeName(nam,i);
		}
		else if(ch==2) {
			System.out.println("Enter Contact no: ");
			String cont=sc.nextLine();
			ChangeCont(cont,i);	
		}
	else if(ch==3) {
		System.out.println("Enter address: ");
		String add=sc.nextLine();
		ChangeAdd(add,i);
		}
	else System.out.print("Index not found."); 
	}
	public void SearchPer(){
		for (int i = 0; i < p.length; i++) {
			if(p[i].getName().compareToIgnoreCase(name) == 0)
			{p[i].DisplayPer();
	}
	else
		System.out.println("Name not found");
	}
		}
	public String DisplayPer(){
		return "\nName: "+name+"\nContact no.: "+contact+"\nAddress: "+address;
	}
	public void AddNewPer() {
		
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter Contact no: ");
		contact=sc.nextLine();
		System.out.println("Enter address: ");
		address=sc.nextLine();
		Person per = new Person(name, contact, address);
		insertPer(per);	
		}
	public void ChangeName(String nam,int i){
		for(int j=0;j<p.length;j++) {
			if(j==i) {
		p[j].name=nam;
		}}
	}
	public void ChangeCont(String cont,int i){
		for(int j=0;j<p.length;j++) {
			if(j==i) {
		p[j].contact=cont;
		}}
	}
	public void ChangeAdd(String add,int i){
		for(int j=0;j<p.length;j++) {
			if(j==i) {
		p[j].address=add;
		}}
	}
}
