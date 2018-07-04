// Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
// Note that the row index starts from 0.
//
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
// Example:
//
//
// Input: 3
// Output: [1,3,3,1]
//
//
// Follow up:
//
// Could you optimize your algorithm to use only O(k) extra space?
//


class Solution {
    public List<Integer> getRow(int rowIndex) {
  
        List<Integer> res = new LinkedList<>();
        res.add(1);
        
        long cur = 1;
        for(int i = rowIndex, b = 1; i > 0; i--, b++){
            cur = cur * i / b;
            res.add((int)cur);
        }
        return res;
        
    }
}
