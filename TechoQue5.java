
public class TechoQue5 {
    
    
    public static void main(String ...args) {
    	char sequence[] = new char[] {'a','a','b','c','a','b','b','b','c','c','c','a','a','a','a','a','c','c','c','b','b'};  // input char squence
        char prevChar =sequence[0];
        int  prevCounter =1;
        char  currentChar = sequence[0];
        int  currentCounter =1;
        
        for(int i=1 ; i< sequence.length; i++) {
        	
        	if(currentChar != sequence[i])
        	{
        		if(currentCounter > prevCounter)
        		{
        			prevChar = currentChar;
            		prevCounter = currentCounter;
            	}
        			
        		currentChar = sequence[i];
        		currentCounter =1;
        	}else
        		currentCounter++;
        }
        
        // finding max char sqeuence from previous and current character
        String str= prevCounter > currentCounter ? prevChar+":"+prevCounter : currentChar+":"+currentCounter;
        
        // output largest contigious sequence of char count
        System.out.print(str);
    }
    
}
