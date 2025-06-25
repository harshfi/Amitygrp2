package Lec2;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int sum=0;
		
		while(n>0) {
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
			
		}
		System.out.println(sum);
		
		
		

	}

}
