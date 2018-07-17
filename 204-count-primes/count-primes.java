// Count the number of prime numbers less than a non-negative number, n.
//
// Example:
//
//
// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//
//


class Solution {
    public int countPrimes(int n) {
        
        if (n <= 2) {
            return 0;
        }
        
        boolean[] isNonPrime  = new boolean[n-2];
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNonPrime[i - 2]) {
                count++;
                for (int j = i; j < n; j += i) {
                    isNonPrime[j - 2] = true;
                }
            }
        }
        
        return count;
        
    }
    
}
