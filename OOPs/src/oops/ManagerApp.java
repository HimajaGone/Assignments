package oops;

import java.util.Scanner;

public class ManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter Gender");
		String gender = scan.next();
		System.out.println("Enter Email");
		String email = scan.next();
		System.out.println("Enter Phone");
		long phone = scan.nextLong();
		System.out.println("Enter Experience");
		int experience = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Address");
		String address = scan.next();
		System.out.println("Enter Company");
		String company = scan.next();
		
		Manager m1 = new Manager(id, name, gender, email, phone, experience, address, company);
		System.out.println("Details of Manager: M1");
		System.out.println(m1.id+" "+m1.name+" "+m1.gender+" "+m1.email+" "+m1.phone+" "+m1.experience+" "+m1.address+" "+m1.company);
		
		m1.working();
		System.out.println();
		Manager m2 = new Manager(id, name, gender, email, phone, experience, address, company);
		System.out.println("Details of Manager: M2");
		System.out.println(m2.id+" "+m2.name+" "+m2.gender+" "+m2.email+" "+m2.phone+" "+m2.experience+" "+m2.address+" "+m2.company);
		
		m2.working();
		scan.close();
	}

}
