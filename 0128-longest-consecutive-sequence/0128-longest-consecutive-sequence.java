import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        if(nums.length==0){
            return 0;
        }

        int curL = 1;
        int longL = 1;
        int prev = sorted[0];
        for(int i=1; i<n; i++){
            if(prev == sorted[i]){
                continue;
            }else if(prev+1== sorted[i] ){
                curL++;
            }else{
                curL=1;
            }
            prev = sorted[i];
            longL = Math.max(longL,curL);
        }
        return longL;
    }
}