import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Loop over unique elements in the set instead of nums
        for (int num : set) {
            // Only start counting if 'num' is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int cnt = 1;
                int next = num + 1;

                while (set.contains(next)) {
                    cnt++;
                    next++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}