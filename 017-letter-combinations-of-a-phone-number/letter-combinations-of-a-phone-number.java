// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//
// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//
//
// Example:
//
//
// Input: "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
//
//
// Note:
//
// Although the above answer is in lexicographical order, your answer could be in any order you want.
//


class Solution {
    
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) {
            return ans;
        }
        
        ans.add("");
		while(ans.peek().length() != digits.length()){
			String remove = ans.remove();
			String map = KEYS[digits.charAt(remove.length()) - '0'];
			for(char c : map.toCharArray()){
				ans.addLast(remove + c);
			}
		}
		return ans;
        
    }
}
