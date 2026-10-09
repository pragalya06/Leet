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
        int count = 0,sum = 0;
        HashMap <Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            count += mp.getOrDefault(sum-k,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}