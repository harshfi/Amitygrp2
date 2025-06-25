package Lec2;

import java.util.*;

public class custominput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int row=1;
		while(row<=n) {
			
			int star=1;
			while(star<=row) {
				System.out.print("* ");
				star=star+1;
			}
			
			row=row+1;
			System.out.println();
			
		}

	}

}
