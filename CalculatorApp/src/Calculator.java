import java.util.*;
public class Calculator {
	Scanner sc = new Scanner(System.in);
	void add() {
		System.out.println("Enter 2 numbers for addition");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	void sub(){
		System.out.println("Enter 2 numbers for Subtraction");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));	}
	void mul(){
		System.out.println("Enter 2 numbers for Multiplication");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	void div(){
		System.out.println("Enter 2 numbers for Division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Division of "+a+" and "+b+" is "+(a/b));
	}
	void rem(){
		System.out.println("Enter 2 numbers for Raminder");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Remainder of "+a+" and "+b+" is "+(a%b));
	}
	void findSquare(){
		System.out.println("Enter a numbers for Square");
		int a = sc.nextInt();
		System.out.println("Square of "+a+" is: "+(a*a));
	}
}
