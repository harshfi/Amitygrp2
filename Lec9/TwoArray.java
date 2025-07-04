package Lec9;

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[][]= new int [3][4];
		
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		print(arr);
	}
	public static void print(int arr[][]) {
		int n= arr.length;
		int m=arr[0].length;
		for(int row=0;row<n;row++) {
			for (int col = 0; col < m; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

}
