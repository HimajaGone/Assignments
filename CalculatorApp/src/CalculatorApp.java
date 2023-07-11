import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Hello User Welcome to KodnestCalculator ");
		System.out.println("+ ======> Addition");
		System.out.println("- ======> Subtraction");
		System.out.println("* ======> Multiplication");
		System.out.println("/ ======> Division");
		System.out.println("% ======> Remainder");
		System.out.println("^ ======> Square");
		System.out.println("! ======> Stop");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while(true) {
			char option = sc.next().charAt(0);
			switch(option) {
			case '+':
				calculator.add();
				break;
			case '-':
				calculator.sub();
				break;
			case '*':
				calculator.mul();
				break;
			case '/':
				calculator.div();
				break;
			case '%':
				calculator.rem();
				break;
			case '^':
				calculator.findSquare();
				break;
			case '!':
				System.out.println("TaTa Bye Bye");
				break;
			default:
				System.out.println("Read message properly");
				break;
			}
		}	
	}
}
