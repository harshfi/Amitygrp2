package Lec14;
import java.util.*;
public class Genrate_Paraen {
   static List<String> list=new ArrayList<>();
	public static void main(String[] args) {
		
		int n=3;
		int total=genrate("",0,0,n);
		System.out.println(list);
		System.out.println(total);

	}
	public static int genrate(String ans, int o,int c,int n) {
		
		if(o==n && c==n) {
			list.add(ans);
			return 1 ;
		}
		
		int open=0,close=0;
		if(o<n) {
			open=genrate(ans+"(",o+1,c,n);
		}
		
		if(c<o) {
			close=genrate(ans+")",o,c+1,n);
		}
		return open+close;
		
	}

}
