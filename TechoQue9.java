/*Q9:(Full Stack)
Give array size = 3, Give Array = [4,3,6]
1. Find Absolute difference between 2 consecutive numbers.
2. The difference is carry forwarded to the next value.
3. Return the final Absolute difference.
For ex - [4,3,6]

1. 4-3 = 1(Carry Forwarded)
2. 1 - 6 = 5(Absolute) Answer = 5 */

public class TechoQue9 {
  public static void main(String ...args) {
	  
	  int array[]= new int[] {4,3,6}; // input array
	  int carryDiff=array[0];      
	  
	  for(int i=1 ; i< array.length ; i++) {
		  carryDiff = Math.abs(carryDiff -array[i]);
		}
	  // output difference
	  System.out.println(carryDiff);
  }
}
