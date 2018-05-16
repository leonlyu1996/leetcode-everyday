// Given two strings s and t , write a function to determine if t is an anagram of s.
//
// Example 1:
//
//
// Input: s = "anagram", t = "nagaram"
// Output: true
//
//
// Example 2:
//
//
// Input: s = "rat", t = "car"
// Output: false
//
//
// Note:
// You may assume the string contains only lowercase alphabets.
//
// Follow up:
// What if the inputs contain unicode characters? How would you adapt your solution to such case?
//


class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] alphabet = new int[26];
        
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        
        for (char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        
        for (int n : alphabet) {
            if (n != 0) {
                return false;
            }
        }
        
        return true;
    }
}
