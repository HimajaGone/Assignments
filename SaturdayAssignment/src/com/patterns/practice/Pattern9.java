package com.patterns.practice;

public class Pattern9 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		char ch='A';
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print(ch);
			ch++;
			
		}
		
		System.out.println();
	}
	}

}
