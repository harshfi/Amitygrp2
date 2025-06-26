package Lec3;

public class Palindrome {

	public static void main(String[] args) {
		
		int n=121;
		
		int rev=0;
		int temp=n;
		
		while(temp>0) {
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
			
		}
		
		System.out.println(n==rev?"palindrome":"nahi hain");

	}

}
