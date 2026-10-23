import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        int longest=0;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for( int val: st){
                    if(st.contains(val-1)  ){
                        continue;
                    }
                    int curL = 1;
                    int next = val +1;

                    while(st.contains(next)){
                        curL++;
                        next++;
                    }
                    longest = Math.max(curL, longest);
        }
        return longest;
    }
}