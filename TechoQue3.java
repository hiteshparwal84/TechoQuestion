
public class TechoQue3 {
	public static void main(String... args) {
		int array[] = new int[] { 10, 11, 5, 6, 8, 9, 4, 3, 15, 6, 4, 5, 1, 0, 4, 7 }; // input unordered array
		int arrayLen = array.length;
		int min = array[0];
		int max = array[0];
		int Fcounter = 0; // front counter
		int Bcounter = arrayLen - 1; // back counter

		// finding min and max value from unordered array in n/2
		for (int i = 0; i < arrayLen / 2; i++) {

			if (min > array[Fcounter])
				min = array[Fcounter];

			if (min > array[Bcounter])
				min = array[Bcounter];

			if (max < array[Fcounter])
				max = array[Fcounter];

			if (max < array[Bcounter])
				max = array[Bcounter];

			Fcounter++;
			Bcounter--;
		}

		// output showing largest difference of 2 numbers in the array
		System.out.print(max - min);
	}
}
