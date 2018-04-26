//
// Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
//
//
// Example 1:
//
// Input: 5
// Output: True
// Explanation: 1 * 1 + 2 * 2 = 5
//
//
//
//
// Example 2:
//
// Input: 3
// Output: False
//
//
//


class Solution {
    public boolean judgeSquareSum(int c) {
        
        int low = 0;
        int high = (int)Math.sqrt(c);
        
        while (low <= high) {
            if (low * low + high * high > c) {
                high--;
            } else if (low * low + high * high < c) {
                low++;
            } else {
                return true;
            }
        }
        
        return false;
    
    }
}
