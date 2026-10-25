    import java.util.*;

    class Solution {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            int prefixSum=0;
            int cnt=0;
            map.put(0, 1);
            for(int  num: nums){
                prefixSum += num;
                int needed = prefixSum - k;
                if(map.containsKey(needed)){
                    cnt += map.getOrDefault( needed, 0);
                }
                map.put(prefixSum, map.getOrDefault( prefixSum, 0) + 1);
            }
            return cnt;
        }
    }