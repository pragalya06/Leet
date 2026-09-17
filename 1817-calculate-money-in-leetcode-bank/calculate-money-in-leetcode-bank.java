class Solution {
    public int totalMoney(int n) {
        int start = 0;
        int sum = 0;
        int count = 1;
        for(int i = 1; i <= n; i++) {
            sum += count + start;
            count ++;
            if(i % 7 == 0) {
                start += 1;
                count = 1;
            }
        }

        return sum;
    }
}