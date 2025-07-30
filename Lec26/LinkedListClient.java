package Lec26;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		
		LinkedList ll=new LinkedList();
		
		ll.AddFront(5);
		ll.AddFront(6);
		ll.AddFront(1);
		ll.AddFront(2);
		ll.AddLast(-1);
		ll.Display();
        ll.removeFront();
        ll.Display();
        
        ll.removeLast();
        ll.Display();
        
	}

}
