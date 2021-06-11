package april;

public class SpiralPrint {
	public static void main(String[] args) {
		int[][] A = new int[][] {
								 {1},
								 {2},
								 {3}
								 };
		
		int[] result = spiralOrder(A);
		
		for(int item: result) {
			System.out.println(item+" ");
		}
	}
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] spiralOrder(final int[][] A) {
        
        int rows = A.length;
        int cols = A[0].length;
        
        return goSpiral(A,0,rows, cols);
        
    }
    
    public static int[] goSpiral(int[][]A, int i, int row, int col){
        int[] result = new int[row*col];
        
        return goSpiral(A,i,row-1,col-1,result,0);
    }
    public static int[] goSpiral(int[][] A, int i, int row, int col, int[] result, int index){
        if( i > row || i > col )
            return result;
            
        for(int t = i; t <= col; t++){
            result[index++] = A[i][t];
        }
        
        for(int t = i+1; t <= row && col > i; t++){
            result[index++] = A[t][col];
        }
        
        for(int t = col-1; t >= i; t--){
            result[index++] = A[row][t];
        }
        
        for(int t = row-1; t > i; t--)
        {
            result[index++] = A[t][i];
        }
        
        return goSpiral(A,++i, row-1,col-1,result,index);
    }
}
