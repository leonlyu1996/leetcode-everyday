// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//
// P   A   H   N
// A P L S I I G
// Y   I   R
//
//
// And then read line by line: "PAHNAPLSIIGYIR"
//
// Write the code that will take a string and make this conversion given a number of rows:
//
//
// string convert(string s, int numRows);
//
// Example 1:
//
//
// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
//
//
// Example 2:
//
//
// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
//
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
//


class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        
        char[] str = s.toCharArray();
        char[] output = new char[str.length];
        
        int i = 0;
        for (int row = 0; row < numRows; row++) {
            int j = row;
            boolean steped = false;
            while (j < str.length) {
                output[i] = str[j];
                if (!steped) {
                    j += 2 * (numRows - row - 1);
                    steped = true;
                    if ((numRows - row - 1) != 0) {
                        i++;
                    }
                } else {
                    j += 2 * row;
                    steped = false;
                    if (row != 0) {
                        i++;
                    }
                }
            }
        }
        
        return String.valueOf(output);
        
    }
}
