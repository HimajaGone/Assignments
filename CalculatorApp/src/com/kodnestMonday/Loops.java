package com.kodnestMonday;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an option to choose");
		while(true) {
			char option = sc.next().charAt(0);
		switch(option) {
		case 'm':
			System.out.println("Coding ninjas day");
			break;
		
		case 't':
			System.out.println("Code + Apptitude day");
			break;
		case 'w':
			System.out.println("code + Reasoning day");
			break;
		case 'h':
			System.out.println("code + DS day");
			break;
		case 'f':
			System.out.println("code + Java");
			break;
		case 's':
			System.out.println("Revise all topics");
			break;
		case 'u':
			System.out.println("aaj tho sunday hai");
			break;
		default:
			System.out.println("Please see message");
			break;
		}		
		}
	}
}
