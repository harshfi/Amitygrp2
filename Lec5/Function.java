package Lec5;

public class Function {

	public static void main(String[] args) {
		Meoww();
		System.out.println("Hello");
		Meoww1();
	}
	
	public static void Meoww() {
		System.out.println("Meowwwwww");
	}
    
	public static void Meoww1() {
		Meoww();
		System.out.println("Say Meoww");
	}

}
