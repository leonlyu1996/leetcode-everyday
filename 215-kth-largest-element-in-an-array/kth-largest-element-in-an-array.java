// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
// Example 1:
//
//
// Input: [3,2,1,5,6,4] and k = 2
// Output: 5
//
//
// Example 2:
//
//
// Input: [3,2,3,1,2,4,5,5,6] and k = 4
// Output: 4
//
// Note: 
// You may assume k is always valid, 1 ≤ k ≤ array's length.
//


class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        
        return quickSelect(nums, k, 0, nums.length - 1);
        
    }

    private int quickSelect(int[] nums, int k, int start, int end) {

        int pivot = nums[end];
        
        int left = start, right = end;
        
        while (left < right) {
            if (nums[left++] < pivot) {
                swap(nums, --left, --right);
            } 
        }
        
        swap(nums, left, end);
        
        int m = left - start;
        
        if (m + 1 == k)
            return pivot;
        else if (m + 1 < k)
            return quickSelect(nums, k - m, left, end);
        else
            return quickSelect(nums, k, start, left - 1);
    }
    
    private void swap(int[]  nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

};
