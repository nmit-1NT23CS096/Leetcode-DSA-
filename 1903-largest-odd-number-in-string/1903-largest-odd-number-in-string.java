class Solution {
    public String largestOddNumber(String num) {
        int i= num.length()-1;
        while(i>=0){
            if((num.charAt(i)-'0')%2 ==1){
                break;
            }
            i--;
        }
        if(num.length()==0){
            return "";
        }
        int j=0;
        while(j<=i && num.charAt(j)=='0'){
            j++;
        }
        if(j>i){
            return "";
        }
        String sb = num.substring(j,i+1);
        int len = j-i+1;
        return sb;




    }
}