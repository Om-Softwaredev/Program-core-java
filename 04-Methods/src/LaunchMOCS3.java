//Method Overloading 
class Calculator4{
	
	
	float add(float a,int b) {
		return a+b;
	}
	
	float add(int c,float a) {
		return a+c;
	}
	
	
}
public class LaunchMOCS3 {

	public static void main(String[] args) {
		Calculator4 calc = new Calculator4();

//		System.out.println(calc.add(10,20));//Ambiguity
		
	}

}
