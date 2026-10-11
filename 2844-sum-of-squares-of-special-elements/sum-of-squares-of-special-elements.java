class Solution {
    public int sumOfSquares(int[] nums) {
        int product = 0;
        int n = nums.length;
        for(int i = 1;i<=n;i++){
            if(n % i == 0) product += nums[i-1]*nums[i-1];
        }
        return product;
    }
}