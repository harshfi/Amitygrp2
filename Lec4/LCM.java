package Lec4;

public class LCM {

	public static void main(String[] args) {
		
		int n1=24;
		int n2=18;
		
		int hcf=1;
		
		for(int i=2;i<=Math.min(n1, n2);i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		
		int lcm=(n1*n2)/hcf;
		System.out.println(lcm);
	}
	
}
