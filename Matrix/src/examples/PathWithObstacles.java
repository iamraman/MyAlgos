package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class PathWithObstacles{
	public static void main(String[] args) {
		/*
		 * int[][] points = {{0, 1, 1, 100, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 1, 0, 0, 0,
		 * 0}, {100, 0, 0, 0, 2, 2}, {0, 0, 0, 2, 0, 2}, {0, 0, 0, 2, 2, 0}};
		 */
		int[][] points = {{0,0,0},
						  {0,1,0},
						  {0,0,0},
						  {1,1,0}};
		System.out.println( new MySolution().uniquePathsWithObstacles(points));
	}
}

class MySolution {
    int answer = 0;
    boolean[][] visited = new boolean[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        rockAndRoll(obstacleGrid, 0, 0, obstacleGrid.length-1, obstacleGrid[0].length-1);
        return answer;
    }
    
    public void rockAndRoll(int[][] obstacleGrid, int x, int y, int rows, int cols){
      if(x > rows || y > cols || obstacleGrid[x][y] == 1 || visited[x][y] == true)
        return;
      
      if(x == rows && y == cols ){
        answer++;
        return;
      }
      
      visited[x][y] = true;
      
      rockAndRoll(obstacleGrid,x,y+1,rows,cols);
      rockAndRoll(obstacleGrid,x+1,y,rows,cols);
      
      visited[x][y] = false;

    }
}