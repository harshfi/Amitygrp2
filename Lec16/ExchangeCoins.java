package Lec16;
import java.util.*;
public class ExchangeCoins {
 static List<List<Integer>> l= new ArrayList<>();
	public static void main(String[] args) {
		int coins[]= {2,3,5};
//		exchange("",8,coins,0);
		exchange(new ArrayList<>(),8,coins,0);
		System.out.println(l);

	}
	public static void exchange
	(List<Integer> ans, int target,int coins[],int i) {
		
		if(target==0) {
			l.add(new ArrayList(ans));
			
			return;
		}
		while(i<coins.length) {
			if(target>=coins[i]) {
				ans.add(coins[i]);
				exchange(ans,target-coins[i],coins,i);
				ans.remove(ans.size()-1);
			}
			i++;
		}
		
		
		
	}
	public static void exchange
	(String ans, int target,int coins[],int i) {
		
		if(target==0) {
			System.out.println(ans);
			return ;
		}
		
		for(;i<coins.length;i++) {
			
			if(target>=coins[i]) {
				exchange(ans+coins[i],target-coins[i],coins,i);
			}
		}
		
	}

}