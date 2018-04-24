// We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).  
//
// Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
//
// Example 1:
//
// Input: 
// bits = [1, 0, 0]
// Output: True
// Explanation: 
// The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
//
//
//
// Example 2:
//
// Input: 
// bits = [1, 1, 1, 0]
// Output: False
// Explanation: 
// The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.
//
//
//
// Note:
// 1 <= len(bits) <= 1000.
// bits[i] is always 0 or 1.
//


class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        if (bits.length <= 2 ) {
            if (bits[0] == 1) {
                return false;
            }
            return true;
        }
        
        if (bits[0] == 1) { 
            return isOneBitCharacter(Arrays.copyOfRange(bits, 2, bits.length));
        }
    
        return isOneBitCharacter(Arrays.copyOfRange(bits, 1, bits.length));
        
        
    }
}
