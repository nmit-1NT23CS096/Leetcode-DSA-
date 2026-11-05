class Solution {
    public int maxDepth(String s) {
        int cnt =0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n; i++){
            char ch = s.charAt(i);
           
            if(ch=='('){
                cnt++;
            }else if(ch==')'){
                cnt--;
            }
            max = Math.max(cnt, max);
        }
        return max;
    }
}