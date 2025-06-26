package Lec3;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int space=1;
			while(space<=(n-row)) {//space
				System.out.print(" ");
				space=space+1;
			}
			
			int star=1;
			while(star<=(2*row-1)) {
				System.out.print("*");
				star=star+1;
			}
			System.out.println();
			row=row+1;
		}
		
		int star=2*(row-2)-1;
		
		while(row<=(2*n-1)) {
			int space=1;
			while(space<=(row-n)) {
				System.out.print(" ");
				space=space+1;
			}
			int s=1;
			while(s<=star) {
				System.out.print("*");
				s=s+1;
			}
			System.out.println();
			star=star-2;
			row=row+1;
		}
		

	}

}
