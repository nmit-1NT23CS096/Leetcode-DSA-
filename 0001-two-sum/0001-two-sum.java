import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[][] ArrIdx=new int[n][2];
        for(int i=0;i<n;i++){
            ArrIdx[i][0]=nums[i];
            ArrIdx[i][1]=i;
        }
        Arrays.sort(ArrIdx,(a,b)->Integer.compare(a[0],b[0]));
        int left =0, right = n-1;


        while( left <= right){
            int sum=ArrIdx[left][0]+ArrIdx[right][0];
            if(sum == target){
                return new int[] {ArrIdx[left][1], ArrIdx[right][1]};
            }else if(sum <= target){
                left++;
            }else{
                right--;
            }
        }

    
return new int[] {-1, -1};

    }
}