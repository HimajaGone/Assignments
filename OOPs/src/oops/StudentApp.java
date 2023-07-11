package oops;

import java.util.Scanner;

public class StudentApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student s1= new Student();
		s1.age=scanner.nextInt();
		s1.name = scanner.next();
		System.out.println("age of student "+s1.age);
		System.out.println("name of the student "+s1.name);
		s1.study();
	
	}

}
