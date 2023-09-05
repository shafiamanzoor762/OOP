package Delete;

public class delete {
	public static void main(String []args) {
int delete=30;
int arr[]={10,40,30,80,60,20};
for(int i=0;i<arr.length-1;i++){
	if(delete==arr[i]) {
		for(int j=i;j<arr.length-1;j++){
			arr[j]=arr[j+1];
		}
		break;
	}
}
for(int j=0;j<arr.length-1;j++){
	System.out.print(arr[j]+",");
}
}
}
