class Solution {
    public int maxScore(int[] a, int k) {
        int n = a.length;
        int r = n-1;
        int cursum = 0;
        for(int i=0; i<k; i++){
            cursum += a[i];
        }
        int mxsum = cursum;
        for(int l = k-1; l>=0; l--){
            cursum += a[r];
            cursum -= a[l];
            mxsum = Math.max(cursum,mxsum);
            r--;
        }
        return mxsum;
    }
}