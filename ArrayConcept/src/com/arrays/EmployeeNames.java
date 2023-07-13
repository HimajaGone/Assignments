package com.arrays;

import java.util.Scanner;

public class EmployeeNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean arr[] = new boolean[n];
		System.out.println("check weather a person is married or not");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("is person "+i+" is married?");
			arr[i]=sc.nextBoolean();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("person "+i+" is "+arr[i]);
		}
		sc.close();
	}
}


