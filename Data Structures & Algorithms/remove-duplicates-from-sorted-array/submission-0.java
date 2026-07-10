class Solution {
    public int removeDuplicates(int[] nums) {
	HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                nums[index++] = num; // overwrite in the original array
            }
        }

        return index; // number of unique elements
        }
}