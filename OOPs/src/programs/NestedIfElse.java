package programs;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("it is a even number");
			if(a%5==0) {
				System.out.println("it is also divisible by 5");
			}
			else {
				System.out.println("It is not divisible by 5");
			}
		}
		else {
			System.out.println("It's a odd number");
		}
		sc.close();
	}

}
