// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
// Note:
//
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
// Example 1:
//
//
// Input: [2,2,1]
// Output: 1
//
//
// Example 2:
//
//
// Input: [4,1,2,1,2]
// Output: 4
//
//


class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> s = new HashSet<>();

        for (int n : nums) {
            if (!s.add(n)) {
                s.remove(n);
            }
        }
        
        Integer[] result = s.toArray(new Integer[0]);
        
        return result[0];
        
    }
}
