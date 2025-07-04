package Lec8;

public class Sqrt {

	public static void main(String[] args) {
		
		System.out.println(sqRoot(28));

	}
	public static int sqRoot(int x) {
		
		int i=0;
		int j=x;
		
		while(i<=j) {
			int m=(j-i)/2+i;
			
			if((long)((long)m*(long)m)==x) return m;
			else if((long)((long)m*(long)m)>x) j=m-1;
			else i=m+1;
		}
		return j;
		
	}

}
