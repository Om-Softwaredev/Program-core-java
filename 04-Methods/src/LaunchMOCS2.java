//Method Overloading with numeric type promotions

class Calculator3{
	
	
	float add(int a,float b) {
		return a+b;
	}
	
	float add(float a,float b,int c) {
		return a+b+c;
	}
	
	
}
public class LaunchMOCS2 {

	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();

		System.out.println(calc.add(10,20));
		
	}

}
