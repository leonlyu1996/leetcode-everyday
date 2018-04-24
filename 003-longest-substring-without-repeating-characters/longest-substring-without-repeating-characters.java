// Given a string, find the length of the longest substring without repeating characters.
//
// Examples:
//
// Given "abcabcbb", the answer is "abc", which the length is 3.
//
// Given "bbbbb", the answer is "b", with the length of 1.
//
// Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
     
        for (int i = 0, j = 0; j < s.length(); j++) {
            Character c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(map.get(c), i);             
            } 
            max = Math.max(max, j - i + 1);
            map.put(c, j + 1);
        }
        
        return max;
        
    }
}
