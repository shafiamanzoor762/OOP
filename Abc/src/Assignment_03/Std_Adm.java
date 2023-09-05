package Assignment_03;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Std_Adm {
public String fname;
public String lname;
public String cnic;
public int interP;
public int age;
public String phno;
public String SubIn1;
public String SubIn2;
public String SubIn3;
public String subject[]={SubIn1,SubIn2,SubIn3};
public static int createstd = 0;
private String elg="NIL";
public Std_Adm(String fname, String lname,String cnic,int interP, int age,String phno,String SubIn1,String SubIn2,String SubIn3 ) {
	this.set( fname,  lname,cnic,interP,age,phno,SubIn1,SubIn2,SubIn3 );
	createstd ++;
}

public Std_Adm()
{
	this("NIL","NIl","NIL",0,0,"NIL","NIL","NIL","NIL");
}
private void set(String fname, String lname,String cnic,int interP, int age,String phno,String SubIn1,String SubIn2,String SubIn3 ) {
	this.fname=fname;
	this.lname=lname;
	this.cnic=cnic;
	this.age = age;
	this.interP=interP;
    this.phno=phno;
    this.SubIn1=SubIn1;
    this.SubIn2=SubIn2;
    this.SubIn3=SubIn3;
}

private void showAll() {
	for (Std_Adm student : stds) {
		System.out.println(student.toString());
	}
	}

public String toString() {
	return fname+","+lname+","+cnic+","+interP+","+age+","+phno+","+SubIn1+","+SubIn2+","+SubIn3+";";
}

public void percent(int per) {
	if(per>60)
		{elg="yes";}
	else{
	elg="No";
	System.out.print("Low Percentege");}
}
public void age(int a) {
	if(a<30) {
		elg="yes";
	}
	else {
		elg="No";
		System.out.print("\nOver Age");}
}
public void subjects(String []sub) {
	for(int i=0;i<3;i++) {
	if(((sub[i].compareToIgnoreCase("stat") == 0)||(sub[i].compareToIgnoreCase("Stat")) == 0)
	  ||((sub[i].compareToIgnoreCase("math") == 0)||(sub[i].compareToIgnoreCase("Math") == 0))
	      &&((sub[i].compareToIgnoreCase("cs") == 0)||(sub[i].compareToIgnoreCase("CS") == 0)))
	   {
		elg="yes";}
	else {
		elg="No";
		System.out.print("\nMissing prerequisites");
		}}
	}
public void addNewStd(Scanner sc) {
	
	System.out.print("Enter Student first name: ");
	fname = sc.nextLine();
	System.out.print("Enter student last name: ");
	lname = sc.nextLine();
	System.out.print("Enter student cnic:");
	cnic=sc.nextLine();
	System.out.print("Enter student phone no.:");
	phno=sc.nextLine();
	System.out.print("Enter subject1");
	SubIn1=sc.nextLine();
	System.out.print("Enter subject2");
	SubIn2=sc.nextLine();
	System.out.print("Enter subject3");
	SubIn3=sc.nextLine();
	sc.nextLine();
	System.out.print("Enter student age:");
	age = sc.nextInt();
    System.out.print("Enter student intermediate percentage:");
	interP=sc.nextInt();
	
	Std_Adm student = new Std_Adm(fname,lname,cnic,interP,age,phno,SubIn1,SubIn2,SubIn3);
		
}

Std_Adm stds[] = new Std_Adm [4]; 
public void saveData() {
	
	File file = new File("admission.txt");
	try {
		FileWriter fileWriter = new FileWriter(file,true);
		String data = "";
		for (Std_Adm student : stds) {
			data+=student.toString();
		}
		fileWriter.write(data);
		fileWriter.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void admission() {
	File file = new File("admission.txt");
	try {
		String data = "";
		String[] stdsData = data.split("\n");
		stds = null;
		System.gc();  
		for (int index = 0; index < stdsData.length; index++) {
	      String[] stdAttr = stdsData[index].split(",");
		  fname=stdAttr[0];
		  lname=stdAttr[1];
		  String cnic=stdAttr[2];
	    int  interP= Integer.parseInt(stdAttr[3]);
		  int age = Integer.parseInt(stdAttr[4]);
		  phno=stdAttr[5];
		   String subj="NIL";
		   subj=subject[0]+"-"+subject[1]+"-"+subject[2];
		   subj =stdAttr[6];
			Std_Adm student = new Std_Adm(fname,lname,cnic,interP,age,phno,SubIn1,SubIn2,SubIn3);
		
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void qualified() {
	File file = new File("qualified.txt");
	try {
		Scanner readFile = new Scanner("admission.txt");
		String data = readFile.nextLine();
		String[] stdsData = data.split(";");
		stds = null;
		System.gc();  
		for (int index = 0; index < stdsData.length; index++) {
			String[] stdAttr = stdsData[index].split(",");
			String name="fname+lname";
			name = stdAttr[0];             
		    phno=stdAttr[1];
			String s="nul";
			subjects(subject);
			if(elg=="yes"){s="Is eligible";}
			else { s="\nMissing prerequisites";}
			 elg=stdAttr[2];
			 s=stdAttr[3];
			Std_Adm student = new Std_Adm(fname,lname,cnic,interP,age,phno,SubIn1,SubIn2,SubIn3);
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	 Std_Adm std = new Std_Adm();
	std.addNewStd(input);
	std.saveData();
	std.showAll();
	std.admission();
	std.qualified();
}
}
