package Lec2;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int count=0;
		int temp=n;
		
		while(temp>0) {
			temp=temp/10;
			count=count+1;
			
		}
		temp=n;
		
		int sum=0;
		
		while(temp>0) {
			int ld= temp%10;
			sum=sum+(int)Math.pow(ld, count);
			temp=temp/10;
		}
		
		if(n==sum)System.out.println("Armstrong");
		else System.out.println("Not a Armstrong");
		
		
		
		
		
		
		
		

	}

}
