/*Q10: (Full Stack)
Write a program to clockwise shift the array of integers cyclically twice.
Input = [3,4,5,6,5]
Output = [6,5,3,4,5]
*/

public class TechoQue10 {
   public static void main(String ...args) {
	   int array[]= new int[] {3,4,5,6,5};  // input array
	   
	   int ar[] = new int[] {array[array.length-1] , array[array.length-2]};
	   
	   for(int i=array.length-1 ; i >1 ; i--  ) {
		   array[i] = array[i-2];
	   }
	   
	   array[0] = ar[1];
	   array[1] = ar[0];
	   // output showing
	   for(int i=0 ; i<array.length ; i++) {
		   System.out.println(array[i]);
	   }
   }
}
