package Lec17;
import java.util.*;
public class Permuation {

	public static void main(String[] args) {
		List<List<Integer>> list= new ArrayList<>();
		int arr[]= {1,2,3};
		permu(new ArrayList<>(),arr,list);
		System.out.println(list);

	}
	public static void permu
	(List<Integer> ans,int arr[],List<List<Integer>> list) {
		
		if(ans.size()==arr.length) {
			list.add(new ArrayList<>(ans));
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
		
			if(ans.contains(arr[i])==false) {
				
				ans.add(arr[i]);
				permu(ans,arr,list);
				ans.remove(ans.size()-1);
			}
		}
	}

}
