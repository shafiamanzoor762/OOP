package Assignment_01;

public class balanceZeroToLast {
	
		public static void main(String[]args)
		{
			int array[]={34,0,54,0,15,98,71,0,13,19};
			 int temp=0;
			 for(int i=0;i<array.length;i++) {
				 if(array[i]==0)
				 {
					 temp=array[10];
				 array[10]=array[i];
				 array[i]=temp;
				 }
			 }
				 for(int i=0;i<array.length;i++) {
					 if(array[i]==0)
					 {
						 temp=array[9];
					 array[9]=array[i];
					 array[i]=temp;
					 } 
				 
				 }
				 for(int i=0;i<array.length;i++) {
					 if(array[i]==0)
					 {
						 temp=array[8];
					 array[8]=array[i];
					 array[i]=temp;
					 } 
				 
				 }
			 for(int i=0;i<array.length;i++) {	
					System.out.print(array[i]+",");
			 }
			 
			 }
	}


