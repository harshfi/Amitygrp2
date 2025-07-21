package Lec19;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[]= {7,5,1,3,9,4};
		
		sort(0,arr.length-1,arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int si, int ei, int arr[]) {
		if(si>ei)return ;
		int pi=find(si,ei,arr);
		sort(si,pi-1,arr);
		sort(pi+1,ei,arr);
	}
public static int find(int si,int ei,int arr[]) {
		
		int item=arr[ei];
		int pi=si;
		
		for(int i=si;i<ei;i++) {
			if(item>arr[i]) {
				int t=arr[pi];
				arr[pi]=arr[i];
				arr[i]=t;
				pi++;
			}
		}
		int t=arr[pi];
		arr[pi]=item;
		arr[ei]=t;
		return pi;
	}


}
