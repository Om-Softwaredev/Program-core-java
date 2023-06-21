import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,5,45,17,5,60,55};
		Scanner scan =new Scanner(System.in);
		boolean flag=true;
		System.out.print("please Enter no to be searched : ");
		int key=scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (key==arr[i]) {
				flag=false;
				System.out.println("element "+key+" found at index : "+i);
				break;
				
			}
		}
		if (flag) {
			System.out.println("Element "+key+" not found!");
		} 
	}

}
