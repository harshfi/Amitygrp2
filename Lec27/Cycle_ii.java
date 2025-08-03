package Lec27;



public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class Cycle_ii {

  public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null) {
        	
        	fast=fast.next.next;
        	slow=slow.next;
        	//cycle
        	if(fast==slow) {
        		
        		ListNode slow2=head;
        		
        		while(slow2!=slow) {
        			slow=slow.next;
        			slow2=slow2.next;
        		}
        		return slow;
        		
        	}
        }
        return null;
        
        
    }

}
