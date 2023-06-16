//can we overload main method in java?

//ans:- yes we can overload main method however jvm will call such a main method which accepts String of args as parameter
public class LaunchMOMain {

	public static void main(String[] args) {
		System.out.println("it's actual main method");
	}
	public static void main(int[] args) {
		System.out.println("accepting int args");
	}
	public static void main(double b) {
		System.out.println("double value");
	}
}
