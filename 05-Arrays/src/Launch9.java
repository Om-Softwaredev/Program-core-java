
public class Launch9 {

	public static void main(String[] args) {
		int[] arr= {10,20,70,86,9,30,99,40,98};
		int max=arr[0];
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Given array is");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("max is :"+max);

		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("min is :"+min);

	}

}
