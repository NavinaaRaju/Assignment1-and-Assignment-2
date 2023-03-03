package com.ebraintech.navinaa;
import java.util.Scanner;
public class Testing {
	public static void arithmeticOperations(int a,int b) {//Static Method
		System.out.println("Addition:"+(a+b));   //Arithmetic Operations
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Product:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulo:"+(a%b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	Scanner arithmeticOperations=new Scanner(System.in);//Scanner
	int a,b;
	System.out.println("Enter the values of a,b:");//Getting inputs from the user using Scanner.
	a=arithmeticOperations.nextInt();
	b=arithmeticOperations.nextInt();
	Testing.arithmeticOperations(a,b);//Calling the static(Arithmetic Operations) method.
	}
		catch (Exception e) {
	      System.out.println("Please,give a valid input.");
	    }
}
}