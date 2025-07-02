package Lec7;

//import javax.print.CancelablePrintJob;

public class GasStation {

	public static void main(String[] args) {
		int []gas = {1,2,3,4,5}; 
		int []cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
		
	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int tgas=0;
		int tcost=0;
		for (int i = 0; i < cost.length; i++) {
			tgas=tgas+gas[i];
			tcost=tcost+cost[i];
		}
		
		if(tgas<tcost)return -1;
		
		//tgas>=tcost
		
		int ans=0;
		int fuel=0;
		
		for (int i = 0; i < cost.length; i++) {
			fuel=fuel+gas[i]-cost[i];
			if(fuel<0) {
				ans=i+1;
				fuel=0;
			}
		}
		return ans;
		
		
		
		
		
		
		
		
	}
// public static int canCompleteCircuit(int[] gas, int[] cost) {
//	       
//		 int n=gas.length;
//		 for(int i=0;i<n;i++) {
//			 int fuel=0;
//			 int temp=0;
//			 for (int j = i; j < (i+n); j++) {
//				
//				 fuel=fuel+gas[j%n]-cost[j%n];
//				 if(fuel<0) {
//					 temp=1;
//					 break;
//				 }
//			}
//			 if(temp==0) return i;
//		 }
//		 return -1;
//		 
//		 
//		 
//	    }	
}
