package Assignment_01;

public class sumThreeEldest {
	public static void main(String[]args)
	{
		int array[]={55,82,54,60,15,98,38,29,13,90};
		 int temp=0;
		 temp=array[0];
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++)
		 {
			 if(array[i]<array[j]) {
				 temp=array[i];
				 array[i]=array[j];
				 array[j]=temp;
			 }
			 
		 }
		 }
			int sum= array[0]+array[1]+array[2];
			System.out.println("sum of the ages of oldest persons is:"+sum);
		 

}}