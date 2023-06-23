
public class ReverseOfString {

	public static void main(String[] args) {
		String str1 ="iNeuron";
		String str2 = "";
		
		for (int i = str1.length()-1; i >=0; i--) {
			str2 +=str1.charAt(i);
		}
		System.out.println("String is : " + str1);
		System.out.println("Reverse of the String is : " + str2);

		System.out.println();
		
//		ineuron java --> avaj norueni
		String str3 ="iNeuron java";
		String str4 = "";
		
		for (int i = str3.length()-1; i >=0; i--) {
			str4 +=str3.charAt(i);
		}
		System.out.println("String is : " + str3);
		System.out.println("Reverse of the String is : " + str4);

		System.out.println();
		
//		ineuron java --> norueni avaj
		String str5 ="iNeuron java";
		String str6 = "";
		
		String arr[]=str5.split(" ");
		for (String ele : arr) {
			for (int i = ele.length()-1; i >=0 ; i--) {
				str6=str6+ele.charAt(i);
			}
			str6+=" ";
		}
		System.out.println("String is : " + str5);
		System.out.println("Reverse of the String is : " + str6);
		
		System.out.println();
		
		String ss="ineuron java";
		String ss2="";
		String ar[]=ss.split(" ");
		for(int i=ar.length-1; i>=0;i--)
		{
			ss2=ss2+ar[i]+" ";
		}
		System.out.println("String is : " + ss);
		System.out.println("Reverse of the String is : " + ss2);
	}

}
