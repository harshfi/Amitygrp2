package Lec24;
import java.util.*;
public class Daily_Temp {

	public static void main(String[] args) {
		
		int []t= {73,74,75,71,69,72,76,73};
		
		int ans[]= findNGE(t);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	public static int [] findNGE(int t[]) {
		int ans[]= new int[t.length];
		
		Stack <Integer> st = new Stack();
		
		for (int i = 0; i < t.length; i++) {
			
			while(!st.isEmpty() && t[i]>t[st.peek()] ) {
				int idx= st.pop();
				ans[idx]=i-idx;
			}
			st.push(i);
		}
		return ans;
		
	}

}
