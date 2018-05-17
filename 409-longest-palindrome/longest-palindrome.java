// Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
// This is case sensitive, for example "Aa" is not considered a palindrome here.
//
// Note:
// Assume the length of given string will not exceed 1,010.
//
//
// Example: 
//
// Input:
// "abccccdd"
//
// Output:
// 7
//
// Explanation:
// One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//


class Solution {
    public int longestPalindrome(String s) {
        
        int[] cnts = new int[128];
        
        for (char c : s.toCharArray()) {
            cnts[c - 'A']++;
        }
        
        int length = 0;
    
        for (int cnt : cnts) {
            length += (cnt / 2) * 2;
        }
        
        length += (length < s.length()) ? 1 : 0;
        
        return length;
        
    }
}
