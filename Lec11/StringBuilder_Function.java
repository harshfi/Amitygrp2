package Lec11;

public class StringBuilder_Function {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		
		System.out.println(sb);
		sb.append("harsh");
		System.out.println(sb);
		sb.append("tripathi");
		System.out.println(sb);
		sb.insert(1, "baklol");
		System.out.println(sb);
		sb.replace(1, 7, "garda");
		System.out.println(sb);

	}

}
