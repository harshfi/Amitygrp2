package Lec15;
import java.util.*;
public class KeyPad {
  static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
     String key[]= {"","","abc","def","ghi","jkl",
    		 "mno","pqrs","tuv","wxyz"};
		
     find("",0,"345",key);
    System.out.println(list);
	}
	public static void find
	(String ans, int idx, String digit,String []key) {
		
		if(idx==digit.length()) {
			list.add(ans);
			return;
		}
		
		int d=digit.charAt(idx)-'0';
		
		String s=key[d];
		for(int i=0;i<s.length();i++) {
			find(ans+s.charAt(i),idx+1,digit,key);
		}
		
	}

}
