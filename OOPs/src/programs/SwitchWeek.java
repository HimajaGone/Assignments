package programs;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 or 2 or 3 or 4 or 5 or 6 or 7");
		int opt = scan.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Sunday Funday");
			break;
		case 2:
			System.out.println("Lazy Monday");
			break;
		case 3:
			System.out.println("Tuesday- Adjust to work");
			break;
		case 4:
			System.out.println("Wednesday- Workday");
			break;
		case 5:
			System.out.println("Thursday- Go with flow");
			break;
		case 6:
			System.out.println("It's Friday- Welcome weekoff");
			break;
		case 7:
			System.out.println("Saturday- let's get hangout");
			break;
		default :
			System.out.println("Please recall number of days in a week");
			
		}

	}

}

