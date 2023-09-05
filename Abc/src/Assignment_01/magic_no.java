package Assignment_01;
import java.util.Scanner;
public class magic_no {
	public static void main(String[]args) {

for(int j=0;j<3;j++) {
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter a number to check whether Magic no:");
int n=sc.nextInt();
int array[]=new int[20];
int sum=0;
int k=0;
for(int i=(n-1);i<=1;i--) {
	double r=(double)n%i;
if(r==0) 
	array[k++]=n;		
}
for(int l=0;l<array.length;l++){
sum+=array[l];
}
if(sum==n) 
	System.out.print(1);
	 if(sum!=n)
	System.out.print(0);
	

}}}