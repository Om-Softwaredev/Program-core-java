//Blue Print of the class called Student
class Student{
	//HAS-Part(variables)
	int sid;
	String sname;
	
	//DOES-Part(methods)
	void playCricket() {
		System.out.println("Student is playing cricket");
	}
	void sleep() {
		System.out.println("Student is Sleeping");
	}
}

//Using Test class for Testing our code
public class Test {
	
	//Driving code- automatically called by JVM
	public static void main(String[] args) {
		
		//Step1:- Creating an Object of Student class
		Student std = new Student();
		std.playCricket();
		
	}
}
