package Lec14;

public class CoinToss {

	public static void main(String[] args) {
	
		Toss("",2);

	}
	public static void Toss(String ans, int n) {
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		Toss(ans+"H",n-1);
		Toss(ans+"T",n-1);
		
		
	}

}
