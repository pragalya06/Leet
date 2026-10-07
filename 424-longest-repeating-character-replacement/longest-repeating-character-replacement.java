class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int l = 0,r = 0,maxfreq = 0,max = 0;
        while(r < s.length()){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            maxfreq = Math.max(maxfreq,mp.get(s.charAt(r)));
            while((r-l+1) - maxfreq > k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l)) == 0) mp.remove(s.charAt(l));
                l++;
            }
            if ((r-l+1) - maxfreq <= k){
                max = Math.max(max , r-l+1);
            }
            r++;
        }
        return max;
    }
}