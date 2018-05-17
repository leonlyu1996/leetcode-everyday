// Given two strings s and t, determine if they are isomorphic.
//
// Two strings are isomorphic if the characters in s can be replaced to get t.
//
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
// Example 1:
//
//
// Input: s = "egg", t = "add"
// Output: true
//
//
// Example 2:
//
//
// Input: s = "foo", t = "bar"
// Output: false
//
// Example 3:
//
//
// Input: s = "paper", t = "title"
// Output: true
//
// Note:
// You may assume both s and t have the same length.
//


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] lastIndexOfS = new int[128];
        int[] lastIndexOfT = new int[128];

        
        for (int i = 0; i < s.length(); i++) {
            int sc = s.charAt(i);
            int tc = t.charAt(i);
            if (lastIndexOfS[sc] != lastIndexOfT[tc]) {
                return false;
            } else {
                lastIndexOfS[sc] = i + 1;
                lastIndexOfT[tc] = i + 1;
            }
        }
        
        return true;
    }
}
