package examples;

public class WordSearch{
	public static void main(String[] args) {
		char[][] arg = new char[][] {{'A','B','C','E'}
									,{'S','R','A','M'}
									,{'A','D','N','A'}};
;		System.out.println(new Solution().exist(arg,"RAMAN"));
	}
}
class Solution {
    public boolean exist(char[][] board, String word) {
    	char req = word.charAt(0);
    	
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board[0].length; j++) {
    			if(board[i][j] == req) {
    				if(dfs(board,i, j, "", word, 0))
    	    			return true;
    			}
    		}
    	}
        return false;
    }
    
    boolean dfs(char[][] board, int x, int y, String current, String target, int currChar){
      if(x>=0 && x < board.length && y >=0 && y < board[0].length && board[x][y] !='0' ){
         current = current+board[x][y];
        if(current.equals(target))
          return true;
      }else {
        return false;
      }
      
      if( board[x][y] == target.charAt(currChar)){
    	  char temp = board[x][y];
    	  	board[x][y] = '0';
    	  boolean exist =  dfs(board,x,y+1,current,target,currChar+1)
        || dfs(board,x,y-1,current,target,currChar+1)
        || dfs(board,x+1,y,current,target,currChar+1)
        || dfs(board,x-1,y,current,target,currChar+1);
    	  
    	  if(exist) 
    		  return true;
        
    	board[x][y] = temp;
      }
      
      return false;
    }
}
