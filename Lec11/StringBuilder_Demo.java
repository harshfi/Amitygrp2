package Lec11;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String ans="";
		System.out.println("String wala loop chal raha hain");
		for (int i = 0; i < 500000; i++) {
			ans=ans+"0";
		}
		System.out.println("String wala loop band ho gaya");
		
		System.out.println("Stringbuilder ki value change hoge");
		for (int i = 0; i <500000; i++) {
			sb.append("0");
		}
		System.out.println("Stringbuilder ka loop khatam");
		

	}

}
