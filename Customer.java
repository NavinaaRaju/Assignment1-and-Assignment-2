package com.ebraintech.navinaa;

public class Customer { //Class
private String name;    //Wrapper Data type ;Access modifier + Data type + Variable Name
private static char initial;
private int height;    //Primitive Data type
private short weight;
private boolean knowJava;
private float monthlyIncome;
private double annualIncome;
private final static long contactNo=9897653410l;//Final Variable

public void method1() {   //WITHOUT RETURN TYPE_Void Method
	System.out.println("WITHOUT RETURN TYPE:");
	System.out.println("'Method 1' is a void method.");
}
public static void method2() {   //WITHOUT RETURN TYPE_Static Void Method
	System.out.println("'Method 2' is a static void method.");
}
public void method3(int no) {//WITHOUT RETURN TYPE_With Arguments
	System.out.println("The value of 'A'in 'Method 3' is:"+no);
}
public int returnMethod() { // WITH RETURN_Without arguments
    int x = 30;
    int y = 20;
    int z = x*y;
    return z;
 }
public int add(int a,int b) { // WITH RETURN_With arguments
    int c = a+b;
    return c;
 }
	public static void main(String[] args) { //MAIN METHOD
		// TODO Auto-generated method stub
Customer customerObj=new Customer(); //Object or Instance
		customerObj.name="Dinesh";   //Object Variable or Normal Variable
		Customer.initial='R';        //Class Variable or Static Variable
		customerObj.height=157;
		customerObj.weight=55;
		customerObj.knowJava=true;
		customerObj.monthlyIncome=30000.00f;
		customerObj.annualIncome=360000.00d;
		customerObj.method1();//Method 1 calling
		customerObj.method2();//Method 2 calling
	    customerObj.method3(12);//Method 3 argument passing
	    int returnMethod=customerObj.returnMethod();
	    System.out.println(".................................................................................................");
	    System.out.println("WITH RETURN TYPE:");
	    System.out.println("The product of x and y is: " +returnMethod);
	    int add=customerObj.add(11, 23);
	    System.out.println("WITH RETURN TYPE_WITH ARGUMENTS:");
	    System.out.println("The sum of a and b is:"+add);	    
	    System.out.println(".................................................................................................");
	    System.out.println("CUSTOMER DETAILS:");
	    System.out.println("Name:"+customerObj.name+"."+Customer.initial+","+"Height:"+customerObj.height+","+"Weight:"+customerObj.weight+","+"Did you know JAVA?"+customerObj.knowJava+","+"Monthly Income:"+customerObj.monthlyIncome+","+"Annual Income:"+customerObj.annualIncome);
	}
}
