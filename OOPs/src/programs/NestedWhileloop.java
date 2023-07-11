package programs;

public class NestedWhileloop {
	public static void main(String[] args) {
		int n=1;
		while(n<4) {
			System.out.println("outer loop "+n);
			int j=1;
			while(j<4) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			n++;
		}
	}
}
