package Lec4;

public class Odd_even_back {

	public static void main(String[] args) {
		
		int n=22222;
		
		int odd=0;
		int even=0;
		
		while(n>0) {
			int ld=n%10;
			if(ld%2==0)even=even+ld;
			else odd=odd+ld;
			
			n=n/10;
		}
		
		if((odd!=0 &&odd%3==0)||(even!=0 &&even%4==0))System.out.println("can ride");
		else System.out.println("Cannot ride");

	}

}
