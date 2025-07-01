package Lec5;

public class Tow_Sum {

	public static void main(String[] args) {
	
		int arr[]= {5,1,4,7,8,2,9};
		
		int target=3;
		int ans[]= TwoSum(arr,target);
		System.out.println(ans[0]+" "+ans[1]);
	}
	
	public static int[] TwoSum(int arr[], int target) {
		
		int ans[]= new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==target) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
	
		return ans;
	}

}
