package Lec28;

import Lec27.ListNode;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class Intersection_Of_LL {

	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	    	int sizeA=size(headA);
	    	
	    	int sizeB=size(headB);
	    	
	    	int dif=Math.abs(sizeA-sizeB);
	    	
	    	if(sizeA>sizeB) {
	    		for (int i = 1; i <= dif; i++) {
					headA=headA.next;
				}
	    	}
	    	if(sizeB>sizeA) {
	    		for (int i = 1; i <= dif; i++) {
					headB=headB.next;
				}
	    	}
	    	
	    	while(headB!=headA) {
	    		
	    		headB=headB.next;
	    		headA=headA.next;
	    	}
	    	return headA;
	    	
	    	
	    }
	    public static int size(ListNode head) {
	    	int size=0;
	    	while(head!=null) {
	    		size++;
	    		head=head.next;
	    	}
	    	return size;
	    }
	    
 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	    	
	    	ListNode A=headA;
	    	ListNode B=headB;
	    	
	    	while(A!=B) {
	    		
	    		if(A==null) A=headB;
	    		else A=A.next;
	    		
	    		if(B==null)B=headA;
	    		else B=B.next;
	    		
	    	}
	    	return A;
	    	
	    }
	}
}
