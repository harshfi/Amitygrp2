package Lec4;

public class AbNumber {

	public static void main(String[] args) {
		
		int n=0;
		int factSum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0)factSum=factSum+i;
			
		}
		System.out.println(factSum==n?"Netural":factSum<n?"Deficit":"abundant");
		
		
	}

}
