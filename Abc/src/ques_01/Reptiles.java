package ques_01;

public class Reptiles extends Pet{
	public  Reptiles(String name) {
		super(name);
	}
	public String speak( ) {
		return" ";
	}
	public static void main(String []args) {
		Reptiles re=new Reptiles("Frog");
		
		System.out.println(re.speak());
		
		
	}
}
