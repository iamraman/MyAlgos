/* @uthor - Raman Verma
 * Email - ramanv6194@gmail.com
 */

import java.util.Scanner;

public class GridMinimumCostPath {
	
	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);

		// Enter n, m for size of matrix -> rowsXcols
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//Input in the matrix
		
		int [][] matrix = new int[n][m];
		
		for(int i =0; i<n; i++)
		{
			for(int j =0; j<m; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		// call minCost() method to findout minimum cost for travelling from 0,0 to n,m
		int answer = minCost(matrix, n, m);
		
		System.out.println( answer );
	}
	
	/**
	 * This method calculates the cost from cell 0,0 to any cell number with pos - n,m .
	 * Uses dynamic programming to compute the best path by comparing [i][j-1] cell that is the one just before the current cell and
	 * cell [i-1][j] which is the cell just above the current cell. Which ever is minimum add current cell's weight to that cell to compute current minimum.
	 * @param matrix
	 * @param n
	 * @param m
	 * @return
	 */
	public static int minCost(int[][] matrix, int n, int m)
	{
		int minCost[][] = new int[n][m];
		int minTime[][] = new int[n][m];
		
		minCost[0][0] = matrix[0][0];
		
		for(int i = 1; i<n; i++)
			minCost[i][0] += minCost[i-1][0]+matrix[i][0];
		
		for(int j = 1; j<m; j++)
			minCost[0][j] += minCost[0][j-1]+matrix[0][j];
		
		
		for(int i = 1; i<n; i++)
		{
			for(int j = 1 ; j<m; j++)
			{
				if( minCost[i-1][j] < minCost[i][j-1] )
					minCost[i][j] = minCost[i-1][j]+matrix[i][j];
				else
					minCost[i][j] = minCost[i][j-1]+matrix[i][j];
			}
		}
		
		return minCost[n-1][m-1];
	}
}