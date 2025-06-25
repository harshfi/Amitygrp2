package Lec2;

public class hcf {

	public static void main(String[] args) {
		
		int n1=40;
		int n2=60;
		
		int hcf=1;
		
		int i=2;
		while(i<=Math.min(n1, n2)) {
			
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
			i=i+1;
		}
		System.out.println(hcf);

	}

}
