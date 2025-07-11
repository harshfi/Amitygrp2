package Lec12;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		sb.append("harsh");
		System.out.println(sb);
		//insert(idx,value);
		sb.insert(2, "tripathi");
		System.out.println(sb);
		
		sb.replace(0,3,"lol");
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		//reverse()
		System.out.println(sb.reverse());

	}

}
