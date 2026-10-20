import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, m=0, h = n-1;
        while(m<=h){

            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,h);
                h--;
                
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}