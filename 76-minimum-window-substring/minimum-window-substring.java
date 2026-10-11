class Solution {
    public String minWindow(String s, String t) {
        int [] hash = new int[256];
        int startindex = 0;
        int minlength = Integer.MAX_VALUE;
        int r = 0,l = 0,cnt = 0;
        for(int i=0 ; i< t.length();i++){
            hash[t.charAt(i)]++;
        }
        while(r < s.length()){
            if(hash[s.charAt(r)]>0) {
                cnt++;
            }
            hash[s.charAt(r)]--;
            while(cnt == t.length()){
                if(r - l+1 < minlength){
                    minlength = Math.min(minlength,r-l+1);
                    startindex = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        if (minlength == Integer.MAX_VALUE) return "";
        return s.substring(startindex,startindex+minlength);
    }
}