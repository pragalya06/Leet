class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int l=0,sum=0,c=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=nums[i];
        //     while(sum>k)
        //     {
        //         sum-=nums[l];
        //         l++;
        //     }
        //     if(sum==k) c++;
        // }
        // return c;
        int count = 0;
        for(int i = 0;i< nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum+= nums[j];
                if(sum == k){
                    count++;
                }
            }
            
        }
        return count;
    }
}