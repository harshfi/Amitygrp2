package Lec12;

public class UnderStanding_of_stack_As_Memory {

	public static void main(String[] args) {
		fun();
		System.out.println("inside main");

	}
	public static void fun() {
		System.out.println("inside a function");
		fun1();
		System.out.println("function 1 ends");
	}
	public static void fun1() {
		System.out.println("inside a fucntion 1");
	}

}
