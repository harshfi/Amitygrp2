package Lec25;

import java.util.Scanner;

public class LinkedListClint {
	static LinkedList Head;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		 LinkedList n= new LinkedList(5);
         Head=n;
         int i=1;
         while(i<5) {
        	 LinkedList nn= new LinkedList();
        	 nn.val=sc.nextInt();
        	 n.next=nn;
        	 n=nn;
        	 i++;
         }
         
         Display(Head);
         AddLast(8);
         Display(Head);
         AddLast(7);
         AddLast(-1);
         Display(Head);
         
         AddFront(-1);
         AddFront(6);
         Display(Head);
         AddPos(3,100);
         Display(Head);
	}
	public static void AddPos(int index,int val) {
		LinkedList curr=Head;
		LinkedList prev=null;
		
		while(index>0) {
			prev=curr;
			curr=curr.next;
			index--;
		}
		
		LinkedList n= new LinkedList(val);
		prev.next=n;
		n.next=curr;
		
	}
	
	public static void AddFront(int val) {
		
		LinkedList n= new LinkedList(val);
		if(Head==null)Head=n;
		n.next=Head;
		Head=n;
	}
	public static void AddLast(int val) {
		if(Head==null) {
			LinkedList n= new LinkedList(val);
			Head=n;
			return;
		}
		
		LinkedList prev= null;
		LinkedList curr=Head;
		
		while(curr!=null) {
			prev=curr;
			curr=curr.next;
		}
		LinkedList n= new LinkedList(val);
		
		
		prev.next=n;
		
	}
	public static void Display(LinkedList Head) {
		LinkedList n= Head;
		
		while(n!=null) {
			System.out.print(n.val+"->");
			n=n.next;
		}
		System.out.println();
	}
	
	

}
