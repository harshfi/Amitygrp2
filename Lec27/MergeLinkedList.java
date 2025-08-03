package Lec27;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class MergeLinkedList {

	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        
		 ListNode p1=list1;
		 ListNode p2=list2;
		 
		 ListNode d=new ListNode();
		 ListNode head=d;
		 
		 while(p1!=null && p2!=null) {
			 
			 if(p1.val> p2.val) {
				 d.next=p2;
				 p2=p2.next;
			 }
			 else {
				 d.next=p1;
				 p1=p1.next;
			 }
			 d=d.next;
		 }
		
		 while(p1!=null) {
			 d.next=p1;
			 p1=p1.next;
			 d=d.next;
		 }
		 while(p2!=null) {
			 d.next=p2;
			 p2=p2.next;
			 d=d.next;
		 }
		 
		 return head;
		 
	    }

}
