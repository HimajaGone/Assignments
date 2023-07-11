package programs;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scan.nextInt();
		if(marks<=35) 
			System.out.println("'D' Grade");
		
		else if(marks>35 && marks<=50) 
			System.out.println("'C' Grade");
		
		else if(marks>50 && marks<=70) 
			System.out.println("'B' Grade");
		
		else if(marks>70 && marks<=90) 
			System.out.println("'A' Grade");
		
		else 
			System.out.println("'O' Grade");
		
		scan.close();
	}

}
