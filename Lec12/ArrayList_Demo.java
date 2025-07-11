package Lec12;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(4);
		list.add(8);
		System.out.println(list);
		
		//contains()
		System.out.println(list.contains(4));
		
		System.out.println(list.get(2));
		list.add(1,10);
		System.out.println(list);
		//remove(idx);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,8));
		
		
		

	}

}
