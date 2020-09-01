/*Q4:(Full Stack)
In a kindergarten, the teachers want to organize a treats distribution.
The teachers decide that the best way to distribute the treats is to seats all the children in a
circle with sequentially numbered seats starting from 1.
The first seat to get a treat will be decided by a draw.
When the max seat number has been reached, the next treat is given to seat no 1.
This goes on until all the treats have been distributed
e.g.
for a 7 seats configuration
draw: 3

the treats will be distributed as follows:
3,4,5,6,7,1,2,3,4,5,6,7,1,2,....
Write a small program that given the starting position from the draw, the number of seats and
the number of treats
a. outputs the seat number which last receive a treat
b. output the number of treats given to each seat/child.
*/
public class TechoQue4 {
   public static void main(String ...args) {
	   int n = 7;
	   int seats[] = new int[n];
	   int draw = 3-1;
	   int treats = 14;
	   int lastTreatSeat=draw;
	   
	   for(int i=1; i<=treats;i++) {
		   lastTreatSeat = (draw%n);
		   seats[lastTreatSeat]++;
		   
		   draw++;
	   }
	   
	   System.out.println(lastTreatSeat+1);
	   for(int j=0 ; j<n ; j++) {
		   System.out.print(seats[j]+" ");
	   }
   } 
}
