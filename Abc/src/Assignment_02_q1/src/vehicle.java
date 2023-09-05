package Assignment_02_q1.src;
import java.util.Scanner;
public class vehicle {
private double regno;
private String color; 
private double speed;
private double fuel;
private String state;
public vehicle(){
	regno=0.0;
	 color="purple";
	 speed=-1;
	 fuel=0;
	 state="stop";
}
public vehicle(double re,String co,double sp,double fu,String st) {
	regno=re;
	color=co;
	speed=sp;
	this.fuel=fu;
	this.state=st;
}
public vehicle(vehicle obj) {
	
	color=obj.color;
	speed=obj.speed;
	fuel=obj.fuel;
	state=obj.state;
}
Scanner sc=new Scanner(System.in);
public void input(){
	System.out.print("Enter regno:");
	regno=sc.nextDouble();
	System.out.print("Enter speed:");
	speed=sc.nextDouble();
	System.out.print("Enter fuel:");
	fuel=sc.nextDouble();
	System.out.print("Enter color:");
	String a=sc.nextLine();
	this.color=sc.nextLine();
	System.out.print("Enter state:");
    state=sc.nextLine();
}
public double addfuel(){
	System.out.print("Enter fuel to add:");
	double f=sc.nextDouble();
	this.fuel=fuel+f;
	return fuel;
	}
 public void moving(){
	 System.out.print("Enter speed:");
	 double sp=sc.nextDouble();
	speed=sp;
		System.out.print("Enter fuel consumption:");
	double  fu = sc.nextDouble();
	fuel-=fu;
   state="moving";
 }
 public void stop(){
	 this.speed=0;
	 this.state="stopped";
 }
 public void display(){
	 
	 System.out.println("\"Vehicle is "+state+". It has "+color+"color. It's speed is "+speed+" and fuel is "+fuel+"\"");
 }
 public static void main(String[] args) {
	 vehicle v1=new vehicle();
	 v1.input();
	 v1.addfuel();
	 v1.moving();
	 v1.display();
	 v1.stop();
	
 }

}
