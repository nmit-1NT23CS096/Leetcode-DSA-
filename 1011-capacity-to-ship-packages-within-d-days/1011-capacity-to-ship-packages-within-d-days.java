class Solution {
    private int daysNeeded(int[] weights, int capacity){
        int days=1, currentLoad = 0;
        for(int w:weights){
            if(currentLoad + w > capacity){
                days = days +1;
                currentLoad = w;
            } else{
                currentLoad += w;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left= Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
       while(left <= right){
        int mid = left + (right - left )/2;
        int needed =  daysNeeded(weights,mid);
        if(needed <= days ){
            right = mid-1;
        }else{
            left = mid +1;
        }
       }
       return left;
    }
}