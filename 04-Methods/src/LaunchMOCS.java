//Method Overloading
//return type has no role to play,it is only methods name and parameters
class Calculator2{
	int add(int a,int b){
		return a+b;
	}
	
//	void add(int a,int b){
//		int res= a+b;
//		System.out.println(res);
//	}
//	
	float add(int a,float b) {
		return a+b;
	}
	
	float add(float a,float b) {
		return a+b;
	}
	
	
}
public class LaunchMOCS {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		int a=10,b=20;
		
		System.out.println(calc.add(a, b));
		
	}

}
