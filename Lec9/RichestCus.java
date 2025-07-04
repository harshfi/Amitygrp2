package Lec9;

public class RichestCus {

	public static void main(String[] args) {
		
		int arr[][]= {{1,5},{7,3},{3,5}};
		
		System.out.println(max(arr));

	}
	public static int max(int arr[][]) {
		int max=Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			int sum=0;
			for (int col = 0; col < arr[row].length; col++) {
				sum=sum+arr[row][col];
			}
			if(max<sum)max=sum;
		}
		return max;

	}

}
