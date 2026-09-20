class Solution {
    public int reverseDegree(String s) {
        int prod = 0;
        int cnt =1;
        for(char c : s.toCharArray()){
            prod+=('z' - c + 1)*cnt;
            cnt++;
        }
        return prod;

    }
}