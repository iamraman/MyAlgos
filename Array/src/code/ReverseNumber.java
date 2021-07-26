package code;

public class ReverseNumber {
	public static void main(String[] args) {
		int source = -123124;
		
		System.out.println(reverse(source));
	}
	static int reverse(int x) {
	      int result = 0;
	      boolean negative = false;
	      
	      if(x < 0){
	        negative = true;
	        x *= -1;
	      }
	      
	      while(x > 0){
	        int last = x%10;
	        int prevResult = result;
	        result = (result<<3) + (result<<1) + x%10;
	        
	        if((result-last)/10 != prevResult)
	          return 0;
	        x /=10;
	      }
	      
	      return negative ? result*-1 : result;
	    }
}
