package com.patterns.practice;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		int i,j,k;
		char ch='A';
		for( i=1;i<=n;i++) {
			for( j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			System.out.print(ch);
			for(k=1;k<2*(i-1);k++) {
					System.out.print(" ");
			}
			
			if(i==1)
					System.out.println(" ");
			else
				System.out.println(ch);
			ch++;
		}
		ch='D' ;
		for(i=n-1;i>=1;i--) {
			
			for(j=n;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print(" "+ch);
			for( k=1;k<2*(i-1);k++) {
				System.out.print(" ");
			}
			if(i==1)
					System.out.println(" ");
			else 
				System.out.println(""+ch);
			ch--;
		}
	

	}

}
