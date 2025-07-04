package Lec8;

import java.util.Scanner;

public class Hollow {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int space=-1;
		int star1= (n/2)+1;
		int star2=(n/2);
		int row=1;
		while(row<=n) {
			int s1=1;
			while(s1<=star1) {
				System.out.print("*\t");
				s1++;
			}
			int sp=space;
			while(sp-->0) {
				System.out.print("\t");
			}
			
			int s2=1;
			while(s2<=star2) {
				System.out.print("*\t");
				s2++;
			}
			
			if(row<=(n/2)) {
				space=space+2;
				star1--;
				if(row!=1)star2--;
			}
			else {
				space=space-2;
				star1++;
				if(row!=(n-1))star2++;
				
			}
			
			row++;
			System.out.println();
		}

	}

}
