class Solution {
    // int f(int nums[], int goal){
    //     if(goal<0) return 0;
    //     int l=0,sum=0,count=0;
    //     for(int r=0;r<nums.length;r++){
    //         sum+=nums[r];
    //         while(sum>goal){
    //             sum-=nums[l];
    //             l++;
    //         }
    //         count+=r-l+1;
    //     }
    //     return count;
    // }
    // public int numSubarraysWithSum(int[] nums, int goal) {
    //     return f(nums,goal)-f(nums,goal-1);
     int f(int [] nums,int k){
        int r = 0,l = 0,sum = 0,count = 0;
        if (k<0) return 0;
        while(r < nums.length){
            sum += nums[r];
            while(sum > k) {
                sum -= nums[l];
                l++;
            }
            if (sum <= k){
                count +=(r-l+1);
            }
            r++;
        }
        return count;
     }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums,goal) - f(nums,goal-1);
        
    }
}