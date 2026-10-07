class Solution {
    public int numberOfSubstrings(String s) {
        int [] lastseen = {-1,-1,-1};
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            lastseen[s.charAt(i) - 'a'] = i;
            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1){
                cnt += 1 + Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
            }
        }
        return cnt;

        // brute force - 1


        // int cnt = 0;
        // int [] hash = new int[3];
        // for(int i = 0;i<s.length();i++){
        //     hash = new int[3];
        //     for(int j = i;j<s.length();j++){
        //         hash[s.charAt(j) - 'a'] = 1;
        //         if(hash[0]+hash[1]+hash[2] == 3) cnt++;
        //     }
        // }
        // return cnt;

        // brute force - 2

        // int cnt = 0;
        // int [] hash = new int[3];
        // for(int i = 0;i<s.length();i++){
        //     hash = new int[3];
        //     for(int j = i;j<s.length();j++){
        //         hash[s.charAt(j) - 'a'] = 1;
        //         if(hash[0]+hash[1]+hash[2] == 3){
        //             cnt += s.length()-j;
        //             break;
        //         }
        //     }
        // }
        // return cnt;
    

        // int [] hash = new int[3] ;
        // int l = 0 ,r = 0,cnt = 0;
        // while(r < s.length()){
        //     hash[s.charAt(r) - 'a']++;
        //     if(hash[0]+hash[1]+hash[2] == 3) {
        //         cnt = cnt + (s.length() - r);
        //         break;
        //     }
        //     if(hash[0]+hash[1]+hash[2] > 3) l++;
        //     r++;
        // }
        // return cnt;
    }
}