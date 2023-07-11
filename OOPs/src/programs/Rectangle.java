package programs;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		rectangleArea r = new rectangleArea();
//		int result = r.rectArea(a,b);
		int n = 20;
		//<< n*2
		System.out.println(n<<1);
		//>> n/2
		System.out.println(n>>1);
		//swapping
		int a =10;
		int b=20;
//		int temp = a;
//		a =b;
//		b = temp;
		System.out.println(a + " "+b);
		//swapping without variable
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a + " "+b);
		
		
	}
}
