package Lec12;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		String s="harsh";
		System.out.println("String wala loop has stated");
		for (int i = 0; i < 400000; i++) {
			s=s+"h";
		}
		System.out.println("String wala loop End");
		sb.append("harsh");
		System.out.println("String builder stated");
		for (int i = 0; i < 400000; i++) {
			sb.append("h");
		}
		System.out.println("String builder Ended");

	}

}
