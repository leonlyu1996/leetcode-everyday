// We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
//
// Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
//
// Example 1:
//
// Input: [1,3,2,2,5,2,3,7]
// Output: 5
// Explanation: The longest harmonious subsequence is [3,2,2,2,3].
//
//
//
// Note:
// The length of the input array will not exceed 20,000.
//
//
//


class Solution {
    public int findLHS(int[] nums) {
        
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        
        int output = 0;
        for (int key : m.keySet()) {
            if (m.containsKey(key + 1)) {
                output = Math.max(output, m.get(key) + m.get(key + 1));
            }
        }
        
        return output;
        
    }
}
