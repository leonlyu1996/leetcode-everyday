// Given a string, sort it in decreasing order based on the frequency of characters.
//
// Example 1:
//
// Input:
// "tree"
//
// Output:
// "eert"
//
// Explanation:
// 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//
//
//
// Example 2:
//
// Input:
// "cccaaa"
//
// Output:
// "cccaaa"
//
// Explanation:
// Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
// Note that "cacaca" is incorrect, as the same characters must be together.
//
//
//
// Example 3:
//
// Input:
// "Aabb"
//
// Output:
// "bbAa"
//
// Explanation:
// "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.
//
//


class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        List<Character>[] bucket = new List[s.length() + 1];
        for (char c : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(c);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(c);
        }
        
        StringBuilder str = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0 ; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        str.append(c);
                    }
                }
            }
        }
        
        return str.toString();
        
    }
}
