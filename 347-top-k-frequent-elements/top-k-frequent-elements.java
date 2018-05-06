//
// Given a non-empty array of integers, return the k most frequent elements.
//
// For example,
// Given [1,1,1,2,2,3] and k = 2, return [1,2].
//
//
// Note: 
//
// You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
// Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
//


class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        
        List<Integer> topK = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && topK.size() < k; i--) {
            if (bucket[i] != null) {
                topK.addAll(bucket[i]);
            }
        }
        
        return topK;
    }
}
