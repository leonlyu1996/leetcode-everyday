// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
// (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//
// Find the minimum element.
//
// You may assume no duplicate exists in the array.
//
// Example:
//
//
// Input: [3,4,5,1,2],
// Output: 1
//
//
//  
//


class Solution {
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return nums[low];
    }
}
