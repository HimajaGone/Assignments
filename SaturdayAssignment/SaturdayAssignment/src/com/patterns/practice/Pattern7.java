package com.patterns.practice;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
