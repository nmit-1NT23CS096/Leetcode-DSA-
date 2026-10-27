class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() -1;
        while(i>=0){
            char ch = num.charAt(i);
            if((ch -'0')%2 ==1){
                break;
            }
            i--;
        }
        if(i<0){
            return "";
        }
        int start = 0;
        while( start <= i && num.charAt(start)=='0')
        {
            start++;
        }
        if(start>i){
            return "";
        }
        return num.substring(start,i+1);
    }
}