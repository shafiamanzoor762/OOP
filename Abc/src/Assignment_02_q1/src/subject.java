package Assignment_02_q1.src;
public class subject {
public String name;
public Double score;
public void set(String n,double s) {
	name=n;
	score=s;
	set(s);
}
public void set(double sc) {
	if(sc<0||sc>100.0) {
		System.out.print("Incorrect score");
		sc=0;
	}
	else {
		score=sc;
	}
}
public void display() {
	System.out.print("\nName:"+name+"\nScore:"+score);
	System.out.print("\n-------------");
	}
public double getScore(double s) {
	return s;
	
}
public boolean greaterthan(subject s) {
	if(score>s.score) 
	{System.out.print("\nlowest value:");
		s.display();
	return true;
	}
	else  
		return false;
	
}
public static void main(String []args) {
	subject s1=new subject();
	subject s2=new subject();
	s1.set("OOP",89.5);
	s2.set("PF",88.4);
	s1.display();
	s2.display();
	s1.greaterthan(s2);
	
}
}
