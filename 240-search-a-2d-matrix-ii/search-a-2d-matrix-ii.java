// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//
// 	Integers in each row are sorted in ascending from left to right.
// 	Integers in each column are sorted in ascending from top to bottom.
//
//
// Consider the following matrix:
//
//
// [
//   [1,   4,  7, 11, 15],
//   [2,   5,  8, 12, 19],
//   [3,   6,  9, 16, 22],
//   [10, 13, 14, 17, 24],
//   [18, 21, 23, 26, 30]
// ]
//
//
// Example 1:
//
//
// Input: matrix, target = 5
// Output: true
//
//
// Example 2:
//
//
// Input: matrix, target = 20
// Output: false
//
//


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            int num = matrix[row][col];
            if (num == target) {
                return true;
            } else if (num < target) {
                row++;
            } else {
                col--;
            }
        }
        
        return false;   
        
    }
}
