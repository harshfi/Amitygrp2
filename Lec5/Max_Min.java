package Lec5;

import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int arr[]= new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=  sc.nextInt();
			
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)max=arr[i];
			if(min>arr[i])min=arr[i];
		}
       System.out.println(min+" "+max);
	}

}
