package Lec8;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,3,5,6,9,11,55,99};
	     int found=BS(arr,1);
	     System.out.println(found);
	}
	public static int BS(int arr[], int target) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i<=j) {
			int mid=(i+j)/2;
			
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) j=mid-1;
			else i=mid+1;
			
		}
		return -1;
		
	}

}
