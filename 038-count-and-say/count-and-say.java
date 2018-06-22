// The count-and-say sequence is the sequence of integers with the first five terms as following:
//
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
//
//
//
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
//
//
//
// Given an integer n, generate the nth term of the count-and-say sequence.
//
//
//
// Note: Each term of the sequence of integers will be represented as a string.
//
//
// Example 1:
//
// Input: 1
// Output: "1"
//
//
//
// Example 2:
//
// Input: 4
// Output: "1211"
//
//


class Solution {
    public String countAndSay(int n) {
        
        return countAndSayHelper(n, "1");
        
    }
    
    public String countAndSayHelper(int n, String s) {
        if (n == 1) {
            return s;
        }
        char ptr = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ptr) {
                sb.append(count);
                sb.append(ptr);
                count = 1;
                ptr = s.charAt(i);
            } else {
                count++;
            }
        }
        
        sb.append(count);
        sb.append(ptr);
        
        return countAndSayHelper(n - 1, sb.toString());
        
    }
}
