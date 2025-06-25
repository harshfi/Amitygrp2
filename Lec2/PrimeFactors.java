package Lec2;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int fact=2;
		while(n>1) {
			
			if(n%fact==0) {
				System.out.println(fact);
				n= n/fact;
			}
			else fact=fact+1;
			
		}

	}

}
