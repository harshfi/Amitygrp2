package Lec9;

public class DiagonalPrint {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3,4},
				      {3,4,5,6},
				      {8,6,3,1},
				      {7,7,2,9}};
		
		//row
		for (int row = arr.length-1; row >=0; row--) {
			int r=row;
			int c=0;
			while(r<arr.length && c<arr[0].length) {
				System.out.print(arr[r][c]+" ");
				r++;
				c++;
		}
		}
       //col
		for(int col=1;col<arr[0].length;col++) {
			int c=col;
			int r=0;
			while(r<arr.length && c<arr[0].length) {
				System.out.print(arr[r][c]+" ");
				r++;
				c++;
		}
		}
	}

}
