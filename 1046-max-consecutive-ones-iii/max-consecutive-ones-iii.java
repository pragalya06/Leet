class Solution {
    public int longestOnes(int[] nums, int k) {
        int r = 0,l = 0,max = 0,cnt = 0;
        while(r < nums.length){
            if(nums[r] == 0)cnt++;
            if(cnt > k){
                if(nums[l]==0) cnt --;
                l++;
            }
            if(cnt <= k){
                max = Math.max(r-l+1,max);
            }
            r++;
        }
        return max;
    }
}