// Write a function that takes a string as input and reverse only the vowels of a string.
//
//
// Example 1:
// Given s = "hello", return "holle".
//
//
//
// Example 2:
// Given s = "leetcode", return "leotcede".
//
//
//
// Note:
// The vowels does not include the letter "y".
//


class Solution {
    
    private void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
    
    public String reverseVowels(String s) {
        
        char[] str = s.toCharArray();
        
        int l = 0;
        int r = str.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (l < r) {
            if (vowels.indexOf(str[l]) != -1 && vowels.indexOf(str[r]) != -1) {
                swap(str, l, r);
                l++;
                r--;
            }
            if (vowels.indexOf(str[l]) == -1) {
                l++;
            }
            if (vowels.indexOf(str[r]) == -1) {
                r--;
            }
            
        }
        
        return new String(str);
        
    }
}
