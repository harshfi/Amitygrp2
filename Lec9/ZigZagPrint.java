package Lec9;

public class ZigZagPrint {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
				      {9,8,7,6},
				      {4,5,7,8}};
		
		for (int row = 0; row < arr.length; row++) {
			
			if(row%2==0) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col]+" ");
				}
				}
			
			else {
					for (int col=arr[0].length-1;col>=0;col--) {
						System.out.print(arr[row][col]+" ");
					}
				}
			
		}
		
		
		}
	}


