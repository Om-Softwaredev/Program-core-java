
public class Launch7 {

	public static void main(String[] args) {
//		1D Array iteration using for each loop
//		int[] arr= {5,8,5,6,8};
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}
		
//		2D Array iteration using for each loop
		int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		for (int[] ar : a) {
			for (int ele : ar) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}

}
