package ques_03;

public class OrderingSystem {
public String item;
public int salesCount;
public Double total=0.0;
public OrderingSystem(String item,int salesCount) {
	this.item=item;
	this.salesCount=salesCount;
}
public double Entree(int i,double r) {
    if(i==1) {item="Tofu Burger";
    salesCount+=r;
    total+=r*3.49;
    Display();
    return total;}
    else if(i==2) {
    item="Cajun Chicken";
    salesCount+=r;
    total+=r*4.59;
    Display();
    return total;}
    else if(i==3) {
    item="Buffalo Wings";
    salesCount+=r;
    total+=r*3.99;
    Display();
    return total;}
    else if(i==4) {
    item="Rainbow Fillet";
    salesCount+=r;
    total+=r*2.99;
    Display();
    return total;}
    else
	return 0.0;
}
public double SideDish(int i,double r) {
	if(i==1) {
	item="Rice Cracker";
	salesCount+=r;
	total+=r*0.79;
	Display();
	return total;}
	else if(i==2) {
	item="No-Salt Fries";
	salesCount+=r;
	total+=r*0.69;
	Display();
	return total;}
	else if(i==3) {
	item="Zucchini";
	salesCount+=r;
	total+=r*1.09;
	Display();
	return total;}
	else if(i==4) {
	item="Brown Rice";
	salesCount+=r;
	total+=r*0.59;
	Display();
	return total;}
	else
 return 0.0;
}
public double Drink(int i,double r) {
	if(i==1) {
	item="Cafe Mocha";
	salesCount+=r;
	total+=r*1.99;
	Display();
	return total;}
	else if(i==2) {
	item="Cafe Latte";
	salesCount+=r;
	total+=r*1.99;
	Display();
	return total;}
	else if(i==3) {
	item="Espresso";
	salesCount+=r;
	total+=r*2.49;
	Display();
	return total;}
	else if(i==4) {
	item="Oolong Tea";
	salesCount+=r;
	total+=r*0.99;
	Display();
	return total;}
	else
		return 0.0;
}
public void Display() {
	System.out.println(item+"\t    "+salesCount+"\t  $"+total);
}
}
