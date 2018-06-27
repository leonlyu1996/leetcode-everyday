// Given two binary strings, return their sum (also a binary string).
//
// The input strings are both non-empty and contains only characters 1 or 0.
//
// Example 1:
//
//
// Input: a = "11", b = "1"
// Output: "100"
//
// Example 2:
//
//
// Input: a = "1010", b = "1011"
// Output: "10101"
//


class Solution {
    
    char carry = '0';
    public String addBinary(String a, String b) {
        
        String output = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 && j >= 0) {
            output = binaryPlus(a.charAt(i), b.charAt(j), carry) +  output; 
            i--;
            j--;
        }
        
        while (i >= 0) {
            output = binaryPlus(a.charAt(i), '0', carry) + output;
            i--;
        }
        
        while (j >= 0) {
            output = binaryPlus('0', b.charAt(j), carry) + output;
            j--;
        }
        
        if (carry == '1') {
            output = "1" + output;
        }
        
        return output;
        
    }
    
    private String binaryPlus(char x, char y, char z) {
        int result = (x - '0') + (y - '0') + (z - '0');
        switch(result) {
            case(0): {carry = '0'; return "0";}
            case(1): {carry = '0'; return "1";}
            case(2): {carry = '1'; return "0";}
            case(3): {carry = '1'; return "1";}
        }
        
        return "";
    }
}
