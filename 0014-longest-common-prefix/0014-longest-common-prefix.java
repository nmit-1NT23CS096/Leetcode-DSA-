class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int n = strs.length;
        for(int i=0; i<first.length(); i++){
            char cur = first.charAt(i);
            for(int j=1; j<n;j++ ){
                if(i>=strs[j].length()  || strs[j].charAt(i)!= cur ){
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}