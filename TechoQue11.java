/*Q11:(Full Stack)
Write a program to find the absolute difference between the sum of even index integers and
odd index integers.
Input = [1,2,3,4,5,6]
Output = 12-9 = 3
*/

public class TechoQue11 {
	public static void main(String ...args) {
		int array[] = new int[] {1,2,3,4,5,6};
		int evenSum =0;
		int oddSum=0;
		
		for(int i=0; i<array.length ; i++) {
			if(i % 2 == 0)
				evenSum +=array[i];
			else
				oddSum += array[i];
		}
		System.out.println(Math.abs(evenSum - oddSum));
		
	}
}
