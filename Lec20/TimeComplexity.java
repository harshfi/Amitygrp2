package Lec20;

import java.util.Iterator;

public class TimeComplexity {

	public static void main(String[] args) {
		
		int n=100000;
		//o(n)
//		for(int i=1;i<n;i++) {
//			System.out.println(i);
//		}
         
		//O(n)
		
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<i;j++) {
				
			}
		}
		
		//sqrt(n)
		for(int i=1;i*i<n;i++) {
			
		}
		
	   int i=1;
	   
	   //O(logN) base 2
	   while(i<n) {
		   i=i*2;
	   }
	   i=n;
	   while(i>1) {
		   i=i/3;
	   }
	   
	   for(int j=0;j<n;j++) {
		   for(int k=j;k<=j;k++) {
			   for(int z=0;z<j;z++) {
				   System.out.println(z);
			   }
		   }
	   }
	   //Nsqrt(N);
	   for(int j=1;j<n;j++) {
		   for(int k=1;k*k<j;k++) {
			   
		   }
	   }
	   i=1;
	   while(i<n) {
		   i=i*3;
		   i=i*2;
		   i=i*4;
		   i=i*5;
		   i=i/15;
	   }
	   
	   for(int j=1;j<n;j++) {
		   i=1;
		   while(i<j) {
			   i=i*2;
		   }
	   }
	}

}
