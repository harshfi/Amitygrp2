package Lec1;

public class basicJava {

	public static void main(String[] args) {
		
//		int a=5;
//		int b=4;
//		int sum=a+b;
//		System.out.println(sum);
		
//		int speed=101;
//		if(speed >100) {
//			System.out.println("$1000 fine ");
//		}
//		else if(speed <100 && speed>=80) {
//			System.out.println("$500 fine");
//		}
//		else {
//			System.out.println("safe hain");
//		}
		
//		int age=19;
//		
//		if(age<10) {
//			System.out.println("not allowed to seat");
//		}
//		
//		else if(age >=10 &&  age<16) {
//			System.out.println("allowed to seat but cannt drive");
//		}
//		else if(age>=16 && age<18)
//			System.out.println("learnig");
//		
//		else System.out.println("Jao jee lo apne jindagi");
		
		
//		int arr[]= {3,6,10};
//		
//		if(arr[0]>5 && arr[5]>5) {
//			System.out.println("nice");
//		}
//		else System.out.println("kjkjhkhj");
		
		
		int pack=600000;
		int offer=5;
		
		if(pack>=700000) {
			if(offer>=3)System.out.println("best");
			else System.out.println("Avg");
		}
		
		else {
			if(offer>=3)System.out.println("good");
			else System.out.println("bekar");
		}
			
//		int i=1;
//		
//		while(i<=1000) {
//			
//			if(i%2==0) {
//				System.out.println(i);
//				i=i+1;
//			}
//			
//		}
		
//		int i=1;
//		
//		while(i<=1000) {
//			if(i%2==0  && i%3==0 && i%7==0) {
//				System.out.println(i);
//			}
//			i=i+1;
//		}
		
		int number=2;
		while(number<=10) {
			
			int mul=1;
			while(mul<=10) {
				System.out.print(number*mul+" ");
				mul=mul+1;
			}
			System.out.println();
			number=number+1;
		}
		
		
		
	}
	
	
	

}
