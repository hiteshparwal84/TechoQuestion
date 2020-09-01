/*Q12:(Full Stack)
Write a program to replace the value of string with its reflection value and starting and end
indexes are given.
Input = abcd, starting index = 1, end index = 2
Output = zxcd
*/

public class TechoQue12 {
  public static void main(String args[]) {
	 String str = "abcd";
	 int start=1;
	 int end =2;
	 
	 for(int i=start-1 ; i<=end-1 ;i++) {
		 char ch = (char)(122-(str.charAt(i)-97)) ;
		 
		 str= str.substring(0,i<0?0:i ) + ch + str.substring(i+1);
	 }
	 
	 System.out.println(str);
  }
}
