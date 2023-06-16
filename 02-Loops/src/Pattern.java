
public class Pattern {

	public static void main(String[] args) {
		
		/* Pattern#1
		 	*****
		 	*****
		 	*****
		 	*****
		 	*****
		 */
		
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	/* Pattern#2
	 	* * * *
	 	*     *
	 	*     *
	 	* * * *
	 	
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(i==0 || i==n-1 || j==0 || j==n-1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
	/* Pattern#3
	 
	 	 *** 
	 	*   *
	 	*   *
	 	*****
	 	*   *
	 	*   *
	 	*   *
	 	
	 */
		
//		int n = 8;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((j==0 && i>0)|| (i==0 && j>0 && j<n/2)||(j==n/2 && i>0)||(i==n/2 && j<n/2)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#4
	 
	 	* * * * 
	 	*      *
	 	*     *
	 	* * * 
	 	*     *
	 	*      *
	 	* * * *
	 	 || (j==(n/2)+1&& i==1)
	 	 (j==(n/2)+1  && i==n-2)|| 
	 */
		
//		int n =11;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0;j < n; j++) {
//				if(((i==0 || i==n-1) && j<n/2) || j==0 ||(i==n/2 && j <= (n/2)-1)|| (j==n/2 && i>0 && i<n-1 && i!=n/2)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
	/* Pattern#5
		 
		   * * * * * *
		 * 
		 * 
		 * 
		 * 
		 * 
		   * * * * * *
	*/
//		int n =7;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if((j==0 && i!=0 && i!=n-1) || ((i==0||i==n-1) && j>0)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		/* Pattern#6
		 
	 	**** 
	 	*   *
	 	*   *
	 	*   *
	 	**** 
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((i==0 && j<n-1)||j==0||(i==n-1 && j<n-1)|| (j==n-1 && i>0 && i<n-1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#7
	 
	 	***** 
	 	*
	 	*****
	 	*
	 	*****
	 */
		
//		int n =7;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(j==0 || i==0||i==n-1 ||i==n/2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
	/* Pattern#8
	 
	 	***** 
	 	*
	 	*****
	 	*
	 	*
	 */
		
//		int n =7;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(j==0 || i==0||i==n/2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
	/* Pattern#9
	 
	 	*******
	 	*     
	 	*
	 	* *****
	 	*  *  *
	 	*  *  *
	 	****  *
	 */
		
//		int n =5;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(j==0 || i==0||(i==n/2 && j!=1)|| (i==n-1 && j<n/2)||(j==n/2 && i>n/2)||(j==n-1 && i>n/2)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
//		or
//		int n =10;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if((i==0 && j>0 && j< (3*n)/2) ||
//						(j==0 && i>0 && i<n-1) || 
//						(i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) || 
//						(j==(3*n)/4 && i>=(n-1)/2)||
//						(i==n-1 && j< (n-1)/2)||
//						(j==(n-1)/2 && i>=(n-1)/2)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
	/* Pattern#10
	 
	 	*   *
	 	*   *
	 	*****
	 	*   *
	 	*   *
	 	
	 */
		
//		int n = 8;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(i==(n-1)/2 || j==0 || j==n-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#11
	 
	 	*****
	 	  *
	 	  *
	 	  *
	 	*****
	 	
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==(n-1)/2|| i==0 || i==n-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#12
	 
	 	*******
	 	   *
	 	   *
	 	   *
	 	*  *
	 	*  *
	 	****
	 	
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==(n-1)/2|| i==0 || (i==n-1 && j<n/2)|| (j==0 && i >n/2)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
	/*Pattern#13
	 
	  *     *
	  *   *
	  * *
	  * 
	  * *  
	  *   *
	  *     *
	 */
		
	/* Pattern#14
	 
	 	* 
	 	*
	 	*
	 	*
	 	*****
	 */
		
	/* Pattern#15
	 
	 	*     *
	 	* * * *
	 	*  *  *
	 	*     *
	 	*     *
//	 	not done
	 
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((j==n/4 && i> n/4 && i<=(3*n)/4)||
//					(j==(3*n)/4 && i> n/4 && i<=(3*n)/4)||
//					(i-j==1 && i>n/4 && i<=n/2 && j<=n/2)||
//					(i+j==(n+1-(n-1)/2) && i>=n/4 && i<=n/2 && j<=(3*n)/4 && j>=n/2)){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#16
	 
	 	*     *
	 	* *   *
	 	*  *  *
	 	*   * *
	 	*     *
	 
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==0 || j==n-1 ||i==j) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#17
	 
	 	  * * *
	 	*       *
	 	*       *
	 	*       *
	 	  * * * 
	 	
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//		if((i==n/4 && j>n/4 && j<(3*n)/4)||
//				(i==(3*n)/4 && j>n/4 && j<(3*n)/4)||
//				(j==n/4 && i>n/4 && i<(3*n)/4)||
//				(j==(3*n)/4) && i>n/4 && i<(3*n)/4)
			
//			 or
			
//				if((i==0 && j>0 && j< n-1) || (i==n-1 && j>0 && j< n-1) || (j==0 && i>0 && i<n-1 )|| (j==n-1 && i>0 && i<n-1)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#18
	 
	 	****
	 	*   *
	 	****
	 	*
	    *
	 	
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==0 || (i==0 && j<(n-1)/2) || (i==(n-1)/2 && j<(n-1)/2) ||
//						(j==(n-1)/2)&& i<(n-1)/2 && i>0){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
	/* Pattern#19
	 
	 	  * * *
	 	*       *
	 	*       *
	 	*    *  *
	 	  * * *
	 	       *  
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((i==n/4 && j>n/4 && j<(3*n)/4)||
//						(i==(3*n)/4 && j>n/4 && j<(3*n)/4)||
//						(j==n/4 && i>n/4 && i<(3*n)/4)||
//						(j==(3*n)/4) && i>n/4 && i<(3*n)/4||
//						(i==j && i>n/2 && j>n/2)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#20
	 
	 	****
	 	*   *
	 	****
	 	* *
	    *   *
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==n/4 && i>=n/4 && i<=(3*n)/4 && i!=n/4 ||
//					(i==n/4 && j>=n/4 && j<(3*n)/4 && j!=(3*n)/4) ||
//					(i==(n-1)/2 && j<(3*n)/4 && j>n/4) ||
//					((j==(3*n)/4)&& i<(n-1)/2 && i>n/4)||
//					(i-j==2 && i>=n/2 && j>=n/4 && j<=(3*n)/4 && i<=(3*n)/4)){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#21
	 
	 	 ***
	 	*
	 	*
	 	 ***
	 	    *
	        *
	     ***
	 	
	 */
//		int n = 11;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((j==n/4 && i>n/4 && i<(n-1)/2 && i!=n/4) ||
//					(i==n/4 && j>n/4 && j<(3*n)/4) ||
//					(i==(n-1)/2 && j<(3*n)/4 && j>n/4) ||
//					((j==(3*n)/4)&& i>(n-1)/2 && i<(3*n)/4)||
//					(i==(3*n)/4 && j>n/4 && j<(3*n)/4)){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
	/* Pattern#22
	 
	 	*****
	 	  *
	 	  *
	 	  *
	 	  *	
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(j==(n-1)/2|| i==0) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#23
	 
	 	  *   *
	 	  *   *
	 	  *   *
	 	  *   *
	 	   ***	
	 */
		
//		int n = 5;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(((j==0||j==n-1) && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
	/* Pattern#24
	 
	 	*       *
	 	 *     *
	 	  *   *
	 	   * *
	 	    *	
	 	    not done
	 */
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((i==j && i >= n/4 && i<(3*n)/4 && j>=n/4 && j<=(3*n)/4)||
//					(i+j==n-1 && j>=n/4 && j<=((3*n)/4)-1 && i > (n/4) && i<=((3*n)/4))) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
	/* Pattern#25
	 
	 	  *     *
	 	  *     *
	 	  *  *  * 
	 	  * * * *
	 	  *	    *
	 */
		
	/* Pattern#26
	 
	 	  *     *
	 	   *   *
	 	    * *
	 	     *
	 	    * *
	 	   *   *
	 	  *     *
	 */
		
//		int n = 10;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if((i==j)||
//					(i+j==n-1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
	/* Pattern#27
	 
	 	  *     *
	 	   *   *
	 	    * *
	 	     *
	 	     *
	 	     *
	 	     *
	 */
		
	/* Pattern#28
	 
	 	 *******
	 	      *
	 	     *
	 	    *
	 	   *
	 	  *
	 	 *******
	 */
		
		int n = 5;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if((i==j)||(i+j==n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
