package Lec21;

public class Software {

	public static void main(String[] args) {
		 int arr[]= new int [5];
		try {
			 System.out.println(arr[1]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("error aa skta tha");
		}
       System.out.println("enjoy");

	}

}
