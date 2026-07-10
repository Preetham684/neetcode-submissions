class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        int k = 0;
        for(int i=0; i<nums2.length; i++){
            if(i<nums.length){
                nums2[i] = nums[i];
            } else {
                nums2[i] = nums[k++];
            }
        }

        return nums2;
    }
}