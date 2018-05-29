// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
// Example 1:
//
//
// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
//
//
// Example 2:
//
//
// Input: "cbbd"
// Output: "bb"
//
//


class Solution {
    public String longestPalindrome(String s) {
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            int len = Math.max(longestPalindromeAround(s, i, i), longestPalindromeAround(s, i, i + 1));
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
                
        }
        
        return s.substring(start, end + 1);
        
    }
    
    private int longestPalindromeAround(String s, int left, int right) {
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        } 
        
        return right - left - 1;
    }
}
