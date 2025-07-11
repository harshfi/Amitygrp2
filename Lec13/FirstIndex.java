package Lec13;

public class FirstIndex {

	public static void main(String[] args) {
		
		int arr[]= {6,2,9,1,9,6,2,3,1,2,1};
		int target=6;
		
		System.out.println(find(arr,0,target));

	}
	public static int find
	(int arr[], int i, int target) {
		
		if(i>= arr.length) return -1;
		
		if(arr[i]==target) return i;
		
		int f=find(arr,i+1,target);
		return f;
	
		
	}

}
