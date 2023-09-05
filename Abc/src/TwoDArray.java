import java.util.Scanner;

public class TwoDArray {
	public static void main(String[]args) {

int array[]=new int[20];

Scanner input = new Scanner(System.in);
	for(int i=0;i<array.length;i++){
	System.out.print("Enter a value:");
	int temp = input.nextInt();
	 array[i]=temp;
	 }
	
	int k=0;
		System.out.println("enter an index  to search a no:");
		 k=input.nextInt();
		for(int j=0;j<array.length;j++){
		
		
	System.out.println("no. search is:"+array[j]);
	}
	int rcount=0;
	for(int j=0;j<array.length;j++){
		if(array[j]==k) {
	rcount++;
	}
	System.out.println("no. search is:"+k+"is occured at:"+rcount+"times in an arrays");


	}
	if(rcount==0)
	{
		System.out.println("no number exist");}
	}
	
}

