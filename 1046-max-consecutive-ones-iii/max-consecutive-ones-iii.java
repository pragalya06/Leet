class Solution {
    public int longestOnes(int[] nums, int k) {
        // int l = 0,r = 0,max = 0,zeroes = 0;
        // while(r < nums.length ){
        //     if (nums[r] == 0) zeroes ++;
        //     while(zeroes > k){
        //         if (nums[l] == 0) zeroes--;
        //         l++;
        //     } 
        //     if(zeroes <= k) max = Math.max(max,r-l+1);
        //     r++;
        // }
        // return max;
        int l = 0,r = 0,max = 0,zeroes = 0;
        while(r < nums.length ){
            if (nums[r] == 0) zeroes ++;
            if(zeroes > k){
                if (nums[l] == 0) zeroes--;
                l++;
            } 
            if(zeroes <= k) max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}