
public class CopyString {

	public static void main(String[] args) {
		String str1 ="iNeuron";
		String str2 = "";
		
		for (int i = 0; i < str1.length(); i++) {
			str2 +=str1.charAt(i);
		}
		System.out.println("String is : " + str1);
		System.out.println("copy of the String is : " + str2);

	}

}
