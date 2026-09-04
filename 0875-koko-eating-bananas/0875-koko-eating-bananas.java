class Solution {
    private long calculateTotalHour(int[] piles, int speed) {
        long totalTime = 0;
        for (int bananas : piles) {
            totalTime += (bananas + speed - 1L) / speed;
        }
        return totalTime;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = 0;
        for (int pile : piles) {
            maxPiles = Math.max(maxPiles, pile);
        }

        int low = 1, high = maxPiles;
        int ans = maxPiles;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long reqTime = calculateTotalHour(piles, mid);

            if (reqTime <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}