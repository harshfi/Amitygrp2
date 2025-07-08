package Lec10;
public class CommonPrefix {

	public static void main(String[] args) {
		
		String strs[] = {"abhijeet","abhinav","abhishek"};
		System.out.println(commonPrefix(strs));
	}
	public static String commonPrefix(String strs[]) {
		
		String cm= strs[0];
		
		for (int idx = 1; idx < strs.length; idx++) {
			int temp=0;
			for (int i = 0; i <
					Math.min(cm.length(), strs[idx].length()); i++) {
				
				if(cm.charAt(i)!=strs[idx].charAt(i)) {
					cm=cm.substring(0,i);
					temp=1;
					break;
				}
			}
			if(temp==0)
				cm=cm.length()<strs[idx].length()?cm:strs[idx];
		}
		return cm;
		
		
		
		
	}

}
