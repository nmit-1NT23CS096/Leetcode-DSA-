class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int right = n-1;
        int maxSum = sum;
        for(int left = k-1;left>=0;left--){
            sum += arr[right];
            sum -= arr[left];
            maxSum = Math.max(maxSum,sum);
            right--;
        }
        return maxSum;


    }
}