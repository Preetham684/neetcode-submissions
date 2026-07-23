class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0) return null;

        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i], 1);
            } else {
                m.put(nums[i], m.get(nums[i]) + 1);
            }
        }

        // Step 1: Convert HashMap entries to a List
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(m.entrySet());

        // Step 2: Sort by frequency (value) in descending order
        Comparator<Map.Entry<Integer, Integer>> comp = new Comparator<>(){
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                return b.getValue().compareTo(a.getValue());
            }
        };

        Collections.sort(entryList, comp);
        // Lambda function - Collections.sort(entryList, (a, b) -> b.getValue().compareTo(a.getValue()));

        //Step 3: Now iterate through sorted list and take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
