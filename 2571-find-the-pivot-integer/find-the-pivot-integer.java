class Solution {
    public int pivotInteger(int n) {
        int lsum = 0;
        int tsum = 0;
        for(int i = 1;i <= n;i++){
            tsum += i;
        }
        for(int i = 1;i <=n ;i++){
            lsum +=i;
            if(lsum == tsum - lsum +i) return i;
        }
        return -1;
        
    }
}