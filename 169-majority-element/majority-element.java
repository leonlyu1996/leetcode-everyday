// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
// You may assume that the array is non-empty and the majority element always exist in the array.
//
// Credits:Special thanks to @ts for adding this problem and creating all test cases.


class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);      
        return nums[nums.length/2];
        
    }
}
