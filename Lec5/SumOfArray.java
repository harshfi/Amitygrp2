package Lec5;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,-1,78};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);

	}

}
