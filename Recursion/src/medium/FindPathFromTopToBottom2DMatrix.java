package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


// if( row ==1 or col == 1 ) return 1
// else return row, col-1 (left) + row-1, col (right)

public class FindPathFromTopToBottom2DMatrix {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int row = 100;//Integer.valueOf(br.readLine());
		int col = 100;//Integer.valueOf(br.readLine());
		
		findPath(row, col);
	}
	
	public static void findPath(int row, int col) {
		
		HashMap<String,Integer> memory = new HashMap<String,Integer>();			//Memorization
		
		System.out.println(path(row,col,memory));
	}
	
	public static int path(int row, int col, HashMap<String,Integer> memory) {
	
		if( row == 1 || col == 1 )
			return 1;
		
		String currentPair = getString(row,col);
		Integer currentCount = memory.get( currentPair );
		
		if( null != currentCount ) {
			return currentCount;
		}
		int left = path(row,col-1,memory);
		int top = path(row-1,col,memory);

		memory.put(currentPair, left + top);
		return left + top;
	}
	
	static String getString(int row, int col) {
		return String.valueOf(row)+String.valueOf(col);
	}
}
