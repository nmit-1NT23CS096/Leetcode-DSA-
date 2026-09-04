class Solution {
    private int sumOfDivisors(int[] nums, int divisor){
        int  totalSum =0;
        for(int num: nums){
            totalSum += (int) Math.ceil((double)num/divisor);
        }
        return totalSum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1, high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        int n  = nums.length;
        if( n > threshold) return -1;
        while( low <= high){
            int mid = (low + high) /2;
            if( sumOfDivisors(nums,mid) <= threshold ){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}