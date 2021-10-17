package code;

public class PalindromeLongest {
    int largest = 0;
    Pair largestIndices = new Pair(0,0);
    public String longestPalindrome(String s) {
      int len = s.length();
      
      for(int i = 0; i < len; i++){
        extendedPalindrome(s, i, i,len);
        extendedPalindrome(s, i, i+1,len);
      }
      
      return s.substring(largestIndices.left,largestIndices.right+1);
    }
  
    public void extendedPalindrome(String s, int left, int right, int len){
      int currLen = 0;
      while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)){
        currLen = right - left + 1;
        if(currLen > largest){
          largest = currLen;
          largestIndices.left = left;
          largestIndices.right = right;
        }
        left--;
        right++;
      }
    }
    public static void main(String[] args) {
		PalindromeLongest obj = new PalindromeLongest();
		System.out.println(obj.longestPalindrome("banana"));
	}
}
class Pair{
  public int left;
  public int right;
  
  public Pair(int a, int b){
    left = a;
    right = b;
  }
}
