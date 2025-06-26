package Lec3;

public class BostonNumber {

	public static void main(String[] args) {
		
		int num=85;
		
		int factSum=0;
		int temp=num;
		int fact=2;
		
		while(temp>1) {
			if(temp%fact==0) {
			    int tempFact=fact;
			    
			    while(tempFact>0) {
			    	int ld=tempFact%10;
			    	factSum=factSum+ld;
			    	tempFact=tempFact/10;
			    }
			    
				temp=temp/fact;
			}
			
			else fact++;
		}
		
		temp=num;
		int digitSum=0;
		while(temp>0) {
			int ld=temp%10;
			digitSum=digitSum+ld;
			temp=temp/10;
		}
        
		System.out.println(digitSum==factSum?"Boston":"nahi hain");
		
		
	}

}
