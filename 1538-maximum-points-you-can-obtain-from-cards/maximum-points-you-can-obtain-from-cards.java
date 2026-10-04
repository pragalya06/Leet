class Solution {
    public int maxScore(int[] c, int k) {
        int sum = 0;
        for (int i = 0;i<k;i++){
            sum += c[i];
        }
        int max = sum;
        int right = c.length-1;
        for(int i = k-1;i>=0 ;i--){
            sum = sum -c[i];
            sum = sum +c[right];
            right--;
            max = Math.max(max,sum);
        }
        return max;
    }
}