class Solution {
    public int characterReplacement(String s, int k) {
        int [] hash = new int[26];
        int r = 0,l = 0,maxfrq = 0,max = 0;
        while(r < s.length()){
            hash[s.charAt(r) - 'A']++;
            maxfrq = Math.max(maxfrq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxfrq > k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1) - maxfrq <=k ){
                max = Math.max(max,r-l+1);
            }
            r++;

        }
        return max;











        // HashMap<Character,Integer> mp = new HashMap<>();
        // int l = 0,r = 0,maxfreq = 0,max = 0;
        // while(r < s.length()){
        //     mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
        //     maxfreq = Math.max(maxfreq,mp.get(s.charAt(r)));
        //     while((r-l+1) - maxfreq > k){
        //         mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
        //         // if(mp.get(s.charAt(l)) == 0) mp.remove(s.charAt(l));
        //         l++;
        //     }
        //     if ((r-l+1) - maxfreq <= k){
        //         max = Math.max(max , r-l+1);
        //     }
        //     r++;
        // }
        // return max;
    }
}