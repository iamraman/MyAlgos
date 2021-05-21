package code;

public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(getFactorial(20));
	}
	
	public static int getFactorial(int arg) {
		
		if(arg == 1) {
			return arg;
		}
		
		return arg * getFactorial(arg-1);
	}

}
