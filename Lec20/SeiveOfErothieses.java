package Lec20;

public class SeiveOfErothieses {

	public static void main(String[] args) {
		
		boolean numbers[]= new boolean[100000];
		
		for(int i=2;i<=100000;i++) {
			
			if(numbers[i]==false) {
				System.out.println(i);
				for (int j = 2*i; j < 100000; j=j+i){
					numbers[j]=true;
				}
					
				}
			}
		}
		
	}


