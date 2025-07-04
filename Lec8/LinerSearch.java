package Lec8;

public class LinerSearch {

	public static void main(String[] args) {

     int arr[]= {1,3,5,6,9,11,55,99};
     int found=LS(arr,44);
     System.out.println(found);

	}
	public static int LS(int arr[], int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)return i;
		}
	return -1;	
	}

}
