class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //int freq;

        if(nums.length == 0) return null;

        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i], 1);
            } else {
                m.put(nums[i], m.get(nums[i]) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(m.entrySet());


        Collections.sort(entryList, (a, b) -> b.getValue().compareTo(a.getValue()));

        //Now iterate through sorted list and take last k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
