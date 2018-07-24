// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
// Example:
//
//
// Given array nums = [-1, 2, 1, -4], and target = 1.
//
// The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
//


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int len = nums.length;
        if (len < 3) {
            return 0;
        }

        Arrays.sort(nums);
        
        int closestSum = target + Integer.MAX_VALUE;     
        
        for (int leftIndex = 0; leftIndex < len - 2; leftIndex++) {
            int leftValue = nums[leftIndex];
            int rightTwoSumValue = twoSumClosest(nums, leftIndex + 1, len - 1, target - leftValue);
            int newSum = leftValue + rightTwoSumValue;
            if (newSum == target) {
                return newSum;
            }
            if (Math.abs(newSum - target) < Math.abs(closestSum - target)) {
                closestSum = newSum;
            }
        }
                                 
        return closestSum;
        
    }
                                 
    private int twoSumClosest(int[] nums, int leftIndex, int rightIndex, int target) {
        int closestSum = target + Integer.MAX_VALUE;
        while (leftIndex < rightIndex) {
            int newSum = nums[leftIndex] + nums[rightIndex];
            if (newSum > target) {
                rightIndex--;
            } else if (newSum < target) {
                leftIndex++;
            } else {
                return newSum;
            }
            if (Math.abs(newSum - target) < Math.abs(closestSum - target)) {
                closestSum = newSum;
            }
        }
        
        return closestSum;
    }                                 
}
