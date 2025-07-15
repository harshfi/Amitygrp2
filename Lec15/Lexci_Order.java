package Lec15;
import java.util.*;
public class Lexci_Order {
 static List<Integer> list= new ArrayList<>();
	public static void main(String[] args) {
		
        for (int i = 1; i <=9; i++) {
			create(i,114);
		}
        System.out.println(list);
	}
	public static void create(int n,int given_n) {
		
		if(n>given_n)return;
		list.add(n);
		n=n*10;
		if(n>given_n)return;
		for (int i = 0; i <=9; i++) {
			create(n+i,given_n);
		}
	}

}
