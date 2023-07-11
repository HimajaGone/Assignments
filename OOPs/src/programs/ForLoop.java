package programs;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int j=0;
//		for(int i=1;i<=5;i++){
//			System.out.println("i="+i);
//			if(i==3) {
//				System.out.println("Omkar");
//				break;
//			}
//			else {
//				System.out.println("Prahllad");
//				continue;
//			}
//			
//		}
//		System.out.println("out of construcrt");
//		for(int i=1;i<=5;i++) {
//			System.out.println("kodman defeated villen "+i);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter energy level");
		//int energylevel = sc.nextInt();

//		while(energylevel!=0) {
//			System.out.println("kodman is fighting and his eneregy level is "+energylevel);
//			energylevel--;
//		}
		int n = 100;
		boolean bored= true;
		int i=1;
		do {
			System.out.println("Kodman read page "+i);
			i++;
			System.out.println("do you want to read?");
			bored = sc.nextBoolean();
		}while(bored);
		System.out.println("kodman got bored");

		}

}
