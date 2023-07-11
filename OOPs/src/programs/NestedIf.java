package programs;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
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
			System.out.println("it is a odd number");
			if(a%5==0) {
				System.out.println("it is also divisible by 5");
			}
			else {
				System.out.println("it is not divisible by 5");
			}
		}
	}

}
