package code;

//Idea is start from each index and try to extend palindrome for both odd and even length.
public class PalindromeCountNumberof {
    int ans = 0;
    public int countSubstrings(String s) {
      int len = s.length();
      for(int i = 0; i < len; i++){						// 'i' will be the mid point of palindrome
        extendedPalindrome(s,i,i, len);					// odd length
        extendedPalindrome(s,i,i+1, len);				// even length
      }
      
      return ans;
    }
  
    public void extendedPalindrome(String s, int left, int right, int len){
      while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)){				//while left and right ==, it's a valid palindrome
        left--;
        right++;
        ans++;
      }
    }
    
    public static void main(String[] args) {
		PalindromeCountNumberof obj = new PalindromeCountNumberof();
		System.out.println(obj.countSubstrings("banana"));
	}
}

