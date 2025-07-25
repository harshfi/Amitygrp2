package Lec24;

import java.util.Stack;

public class  StockSpanner {
	   Stack <int[]> st; //0=day 1=price
		    public StockSpanner() {
		       st= new Stack(); 
		    }
		    
		    public int next(int price) {
		        int day=1;
		        while(!st.isEmpty() && st.peek()[1]<=price) {
		        	int arr[]= st.pop();
		        	day=day+arr[0];
		        }
		        int narr[]= new int[2];
		        narr[0]=day;
		        narr[1]=price;
		        st.push(narr);
		        return day;
		    }
		}