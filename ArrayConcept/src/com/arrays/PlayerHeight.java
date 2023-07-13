package com.arrays;

import java.util.Scanner;

public class PlayerHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float arr[][] = new float[2][3];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter height of game "+i+" player height "+(j));
			arr[i][j] = sc.nextFloat();
			}
		}
		System.out.println("Heights of players....");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
