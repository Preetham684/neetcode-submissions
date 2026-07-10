class Solution {
    public boolean isAnagram(String s, String t) {
        //Step 1: Sort the string characters based on their ASCII chars
        //Step 2: Compare both the strings with isequal method

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String s2 = String.valueOf(chars1);
        String t2 = String.valueOf(chars2);

        if(s2.equals(t2)){
            return true;
        } else {
            return false;
        }



    }
}
