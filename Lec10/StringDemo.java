package Lec10;

import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
		
		String s= "harsh";
		//charAt(i);
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(3));
		
		//length()
		System.out.println(s.length());
		
		System.out.println(s.contains("ar"));
		
		//substring(index)
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(3));
		
		//substring(i,end+1)
		System.out.println(s.substring(1,4));
		String str="harsh is a good boy";
		
		String words[]=str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		//split()
	   System.out.println(s.equals(str));
	   
	   
		
		
	}

}
