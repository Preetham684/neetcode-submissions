class Solution {
    public int scoreOfString(String s) {
        int end = 0;

        char[] chars = s.toCharArray();
        int[] sum = new int[chars.length];
            for(int i=0; i<chars.length-1; i++){
                sum[i] = Math.abs(chars[i+1]-chars[i]);
            }

            for(int i=0;i<chars.length-1;i++){
                end = sum[i] + end;
            }

        return end;
        }
}