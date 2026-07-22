class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<String, List<String>>();
        //Map interface holding the child class HashMap

        for(String s: strs){
            char ch[] = s.toCharArray(); //converts string to char array
            Arrays.sort(ch);
            String s1 = String.valueOf(ch); //converts char to string array

            if(!m.containsKey(s1)){
                m.put(s1, new ArrayList());
            }

            m.get(s1).add(s);
        }

        return new ArrayList(m.values());


        

    }
}
