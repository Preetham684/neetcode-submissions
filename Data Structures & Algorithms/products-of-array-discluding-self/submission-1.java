class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int[] result = new int[n];
        for(int i = 0; i<n; i++){
            result[i] = 1; // result = [1, 1, 1, 1] for example
        }

        for(int i = 0; i<n; i++){
            result[i] *= prefix;
            prefix = prefix * nums[i];
             
        }

        for (int i=n-1; i>=0; i--){
            result[i] *= suffix; 
            suffix = suffix * nums[i];
            
        }

        return result;
    }
}  
