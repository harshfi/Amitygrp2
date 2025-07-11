package Lec13;

public class Last_Index {

	public static void main(String[] args) {
		
		int arr[]= {6,2,9,3,1,9,6,2,3,1,2,1};
		int target=3;
		int n=arr.length;
		System.out.println(find(arr,n-1,target));
	}
	public static int find
	(int arr[], int i,int target) {
		
		if(i<0)return -1;
		
		if(arr[i]==target)return i;
		
		int f=find(arr, i-1, target);
		return f;
		
	}

}
