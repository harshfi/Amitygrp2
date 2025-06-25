package Lec2;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int f=0;
		int s=1;
		
		System.out.print(f+" "+s+" ");
		
		int ele=2;
		
		while(ele<=n) {
			
			int sum=f+s;
			
			System.out.print(sum+" ");
			
			f=s;
			s=sum;
			
			ele=ele+1;
			
			
		}
		

	}

}
