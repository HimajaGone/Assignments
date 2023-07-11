package oops;

import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num1");
		int a = scan.nextInt();
		System.out.println("enter a num2");
		int b =scan.nextInt();
		if(a>b) {
			System.out.println(b-a);
		}
		else {
			System.out.println(a-b);
		}
	}

}
