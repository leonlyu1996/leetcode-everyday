// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
// Find all the elements of [1, n] inclusive that do not appear in this array.
//
// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
// Example:
//
// Input:
// [4,3,2,7,8,2,3,1]
//
// Output:
// [5,6]
//
//


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> disappearedNumbers = new LinkedList<>();
        
        int appear_twice_count = 0;
        
        for (int i = 0 ; i < nums.length; ) {
            if (nums[i] ==  nums[nums[i] - 1]) {
                i++;
            } else {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                disappearedNumbers.add(i + 1);
            }
        }
        
        return disappearedNumbers;

    }
    
    public void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
