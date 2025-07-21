package Lec20;

public class clientStudent {

	public static void main(String[] args) {
	Studentproperty s= new Studentproperty();
	Studentproperty s1= new Studentproperty();
	 s.name="shilpa";
	 s.age=15;
	 s.course="btech";
	 s.house("Red");
	 
//	 System.out.println(s.name+" "+s.age+" "+s.course+" "+" "+s.house);
	 s1.name="Prachi priya";
	 s1.age=14;
	 s1.course="btech";
	 s1.house("Yellow");
	 System.out.println();
//	 System.out.println(s1.name+" "+s1.age+" "+s1.course+" "+" "+s1.house);
	 print(s1,s);
	 findAge(s1.age,s.age);
	 
	}
	public static void findAge(int age1, int age2) {
		System.out.println(age1+" "+age2);
	}
	public static void print(Studentproperty s, Studentproperty s1) {
		s1=s;
		 System.out.println(s.name+" "+s.age+" "+s.course+" "+" "+s.house);
		 System.out.println(s1.name+" "+s1.age+" "+s1.course+" "+" "+s1.house);
	}

}
