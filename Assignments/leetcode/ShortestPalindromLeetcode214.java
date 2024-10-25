package leetcode;

public class ShortestPalindromLeetcode214 {
	
	
	    public static String shortestPalindrome(String s) {
	        int n=s.length(),j=0;

	        for(int i=0;i<n;i++)
	        {
	            if(s.charAt(j)==s.charAt(n-i-1))
	                j++;
	        }
	            if(j==n)
	                return s;

	            String P=new StringBuilder(s.substring(j,n)).reverse().toString();
	            return P+shortestPalindrome(s.substring(0,j)+s.substring(j));
	               
	        }
	    
	    public static void main(String args[]) {
	    	System.out.println(shortestPalindrome("abcd"));
	    }
	    
	
}
