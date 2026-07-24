class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;

        for(int f = freq.length-1; f > 0 && idx < k; f--){
            for(int num : freq[f]){
                result[idx++] = num;
                if(idx == k) return result;
            }
        }
        return result;
    }
} 