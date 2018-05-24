// Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
//
//
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//
//
// Example:
//
// matrix = [
//    [ 1,  5,  9],
//    [10, 11, 13],
//    [12, 13, 15]
// ],
// k = 8,
//
// return 13.
//
//
//
// Note: 
// You may assume k is always valid, 1 ≤ k ≤ n2.


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
              
        int low = matrix[0][0], high = matrix[n-1][n-1]; 
        
        while (low <= high) {
            
            int mid = low + (high - low) / 2;
            int cnt = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] <= mid) {
                        cnt++;
                    }
                }
            }
        
            if (cnt >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
        
    }
}
