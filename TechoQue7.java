/*Q7:(Full Stack)
Give array size = 6 Given array = [1,2,3,4,5,6]; Consider array's 1st position is odd and so on.
Need to calculate the sum of Odd position number - 1 + 3 + 5 = 9
Need to calculate the sum of Even position number - 2 + 4 + 6 = 12
Absolute difference = 9 - 12 = 3(Not -3)

*/
public class TechoQue7 {
  public static void main(String ...args) {
	  
	  int array[] = new int[] {1,2,3,4,5,6};  // array of size 6
	  int oddSum =0;
	  int evenSum=0;
	  
	  for(int i=0; i< array.length; i++) {
		  if(i%2 ==0)
		    oddSum += array[i];
		  else
			evenSum += array[i];
	  } 
	  System.out.println(Math.abs(oddSum-evenSum));
  }
}
