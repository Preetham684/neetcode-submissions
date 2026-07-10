class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Step 1: Loop through every number 
        //Step 2: Check if the first number is the same as the second number
        //Step 3: If it is the same then break loop. If not, continue checking 

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    
}