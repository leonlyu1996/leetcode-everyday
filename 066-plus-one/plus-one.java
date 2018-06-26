// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
// You may assume the integer does not contain any leading zero, except the number 0 itself.
//
// Example 1:
//
//
// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
//
//
// Example 2:
//
//
// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
//
//


class Solution {
    public int[] plusOne(int[] digits) {
        
        int d = digits.length - 1;
        LinkedList<Integer> l = new LinkedList<>();
        
        while (d >= 0 && digits[d] == 9) {
            l.addFirst(0);
            d--;
        }
        
        if (d == -1) {
           l.addFirst(1);
        } else {
            l.addFirst(digits[d] + 1);
            while (--d >= 0) {
                l.addFirst(digits[d]);
            }
        }  
        
        return l.stream().mapToInt(i->i).toArray();
        
    }
}
