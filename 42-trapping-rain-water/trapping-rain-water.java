class Solution {
    public int trap(int[] h) {
        // int lmax=0;
        // int rmax=0;
        // int n=h.length;
        // int l=0,r=n-1;
        // int water=0;
        // while(l<=r)
        // {
        //     if(h[l]<=h[r])                   // Process the left element
        //     {
        //         lmax=Math.max(lmax,h[l]);
        //         water+=(lmax-h[l]);
        //         l++;
        //     }
        //     else{                            // Process the right element
        //         rmax=Math.max(rmax,h[r]);
        //         water+=(rmax-h[r]);
        //         r--;
        //     }
        // }
        // return water;
        int n = h.length;
        int [] suffixmax = new int[n];
        suffixmax[n-1] = h[n-1];
        int [] prefixmax = new int[n];
        prefixmax[0] = h[0];
        for(int i = 1;i<n;i++){
            prefixmax[i] = Math.max(prefixmax[i-1],h[i]);
            suffixmax[n-i-1] = Math.max(suffixmax[n-i],h[n-i-1]);
        }
        int total = 0;
        for(int i = 0;i<n;i++){
            int rmax = suffixmax[i];
            int lmax = prefixmax[i];
            if(h[i] <suffixmax[i] && h[i] <prefixmax[i] ){
                total += Math.min(rmax,lmax)-h[i];
            }
        }
        return total;
    }
}