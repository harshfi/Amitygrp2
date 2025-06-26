package Lec3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=0;
		for(int i=2;i<=(n-1);i++) {
			
			if(n%i==0) {
				System.out.println("Not a prime number");
				temp=1;
				break;
			}
			
		}
		
		if(temp==0)System.out.println("prime number");

	}

}
