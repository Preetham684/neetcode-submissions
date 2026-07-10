class Solution {
    public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            char x; boolean matched = false;
            
            if(s.length()%2!=0) return false;
            
            for(int i =0; i<s.length(); i++){
                x = s.charAt(i); 
                
                if((x=='[')||(x=='(')||(x=='{'))
                		st.push(x);
                else if(!st.isEmpty()) {
                		char poppedChar = st.pop();
                		if((poppedChar == '(' && x == ')') || (poppedChar == '{' && x == '}') || (poppedChar == '[' && x == ']' )) {
                			matched = true;
                		}else {
                			break;
                		}
                }
            }
            
            if(!st.isEmpty()) matched = false;
            return matched;
            
    }
}
