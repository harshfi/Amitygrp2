package Lec8;

public class PeakElement {

	public static void main(String[] args) {
		
		int arr[]= {2,3,7,11,13,10,8,3};
		int find=Peak(arr);
		System.out.println(find);
	}
	
	public static int Peak(int arr[]) {
		
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			
			int mid=(i+j)/2;
			if(arr[mid]<arr[mid+1])i=mid+1;
			else j=mid-1;
		}
		return i;
	}

}
