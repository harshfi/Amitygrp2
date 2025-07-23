package Lec21;

public class Static_Meaning {

	public static void main(String[] args) {
		
		student s= new student("nilesh",1);
		student s1=new student("harsh",2);
		
	 System.out.println(s.name+" "+s1.name);
	
	 System.out.println(s.count);
	 System.out.println(s1.count);
     System.out.println(student.count);
     
     
	 

	}

}
