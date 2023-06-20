import java.util.Scanner;

public class Launch4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter no of classes : ");
		int cls=scan.nextInt();
		
		int[][] arr = new int[cls][];//2D jagged array
		for (int i = 0; i < cls; i++) {
			System.out.print("please enter no of student in class "+ i +" : ");
			int std = scan.nextInt();
			arr[i]=new int[std];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter marks of class "+ i + " and student "+ j +" ");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("marks of the student");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
