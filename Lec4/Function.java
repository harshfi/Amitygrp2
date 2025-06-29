package Lec4;

public class Function {

	public static void main(String[] args) {
		
		System.out.println("hello");
		fun(1,2);
		fun(1,2,3);
		System.out.println("bye bye");
		System.out.println(add(1,2,3));
		
	}
	public static void fun(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void fun(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}

}
