package Lec4;

public class Happy {

	public static void main(String[] args) {
		
		int n=18;
		int temp=0;
		for(int i=1;i<=1000;i++) {
			int sum=0;
			while(n>0) {
				int ld= n%10;
				sum=sum+(ld*ld);
				n=n/10;
			}
			
			n=sum;
			
			if(n==1) {
				temp=1;
				break;
			}
		}
		
		System.out.println(temp==1?"oyee happy happy oye":"main har har gaya bhaiya bekar");

	}

}
