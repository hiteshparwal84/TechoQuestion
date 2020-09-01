//Q8:(Full Stack)
//Find the Volume of the sphere on given Diameter d. Up to 2 decimal values.
//If Volume = 33.489012 => 33.49

import java.util.Scanner;
public class TechoQue8 {
   public static void main(String ...args) {
	   Scanner sc = new Scanner(System.in);
	   int diameter =sc.nextInt();
	   Double result = (3.14* diameter * diameter * diameter)/6;
	   System.out.println(String.format("%.2f", result));
   }
}
