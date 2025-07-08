package Lec10;

public class CountSortedFreq {

	public static void main(String[] args) {
		
		String s="aaaabbbcckkmmooxyzz";
		
		for (int i = 0; i < s.length(); ) {
			int j=i;
			while(j<s.length()&&s.charAt(i)==s.charAt(j)) {
				j++;
			}
			System.out.print(s.charAt(i)+""+(j-i));
			i=j;
			
		}

	}

}
