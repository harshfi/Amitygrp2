package Lec12;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	public static int fact(int n) {
		if(n==1) return 1;
		int smaller=fact(n-1);//function calling it self
		return n*smaller;
	}

}
