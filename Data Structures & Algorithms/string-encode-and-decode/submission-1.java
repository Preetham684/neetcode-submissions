class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";

        StringBuilder result = new StringBuilder();

        for(String s: strs){
            result.append(s.length()).append("#").append(s); //5#Hello5#World
        }
        
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str == null || str.isEmpty()) return list;
        int i = 0;

        while(i<str.length()){
            //Step 1: Find the delimiter "#"
            int j = i;
            while(str.charAt(j)!='#') j++;

            //Step 2: Extract the length from the numbers before "#"
            int length = Integer.parseInt(str.substring(i, j));

            //Step 3: Move the pointer to the start of the actual word after "#"
            i = j+1;

            //Step 4: Extract the word and store it in the list
            list.add(str.substring(i, i+length));

            //Step 5: Move pointer past this string and repeat the process
            i = i + length;
        }

        return list;
    }
}
