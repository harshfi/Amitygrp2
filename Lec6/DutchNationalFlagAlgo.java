package Lec6;

public class DutchNationalFlagAlgo {

	public static void main(String[] args) {
		
		int arr[]= {2,0,2,1,1,0};
		
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int arr[]) {
		
		int s=0;
		int e=arr.length-1;
		
		int i=0;
		
		while(i<=e) {
			
			if(arr[i]==0) {
				int temp=arr[s];
				arr[s]=arr[i];
				arr[i]=temp;
				s++;
				i++;
			}
			else if(arr[i]==2) {
				int temp=arr[e];
				arr[e]=arr[i];
				arr[i]=temp;
				e--;
			}
			else i++;
			
		}
		
	}

}
