package Lec16;

public class QueenAndChair {

	public static void main(String[] args) {
		
		boolean chair[]= new boolean[3];
		
		Seat("",2,chair);
	}
	public static void Seat(String ans,int n,boolean chair[]) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<chair.length;i++) {
			
			if(chair[i]==false) {
				chair[i]=true;
				Seat(ans+"C"+i+"Q"+n+" ",n-1,chair);
				chair[i]=false;//backtracking
				
			}
		}
		
	}

}
