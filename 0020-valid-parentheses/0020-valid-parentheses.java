class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ch,top;

        int n=s.length();
        for(int i=0; i<n;i++){
            ch = s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(ch);
            }else{
                if (st.isEmpty()) return false;
                top = st.pop();
                if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}