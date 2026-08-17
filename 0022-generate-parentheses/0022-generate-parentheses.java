class Solution {
    List<String> res  = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack("",0,0,n);
        return res;
    }
    private void backtrack(String cur, int open, int close,int n){
        if(open==n && close ==n){
            res.add(cur);
            return;
        }
        if(open < n) backtrack(cur+"(",open+1,close,n);
        if(close < open) backtrack(cur+")",open,close+1,n);
    }

}