package Lec19;

public class Povit_Index {

	public static void main(String[] args) {
		
		int arr[]= {7,5,1,3,9,4};
		
		int pi=find(0,arr.length-1,arr);
		System.out.println(pi);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
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
