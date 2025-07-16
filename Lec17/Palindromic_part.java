package Lec17;
import java.util.*;
public class Palindromic_part {

	public static void main(String[] args) {
		
		String s="abab";
		partation(s,new ArrayList<>());

	}
	public static void partation(String s,List<String> list) {
		
		if(s.length()==0) {
			System.out.println(list);
			return;
		}
		
		for(int i=1;i<=s.length();i++) {
			
			String str=s.substring(0,i);
			if(isPalendrom(str)==true) {
				list.add(str);
				partation(s.substring(i),list);
				list.remove(list.size()-1);
			}
		}
		
	}
	public static boolean isPalendrom(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
