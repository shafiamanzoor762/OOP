package Assignment_01;

public class even_odd {
	public static void main(String[]args)
	{int rcount=0;
	int num=0;
		int array[]={7,3,5,4,5,3,4};
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++) {
			if(array[i]==array[j]) {
				
			rcount++;
			num=array[i];
		}}
			}
			if(rcount%2!=0)		
				System.out.print(num);
				
		
		}
			}
		
	

