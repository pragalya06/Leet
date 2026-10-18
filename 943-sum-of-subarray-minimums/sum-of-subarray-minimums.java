class Solution {
    int [] pse(int [] arr){
        int n = arr.length;
        Stack <Integer> st= new Stack<>();
        int [] pse = new int[n];
        for(int i = 0;i< n;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        } 
        return pse;
    }
    int [] nse(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] nse = new int[n];
        for(int i = n-1 ;i>=0 ;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            nse [i] = st.isEmpty() ? n : st.peek();
            st.push(i);  

        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {

        // T.L.E Brute Force

        // int n = arr.length;
        // int mod = 1000000007;
        // long sum = 0;
        // for(int i = 0;i<n;i++){
        //     int min = Integer.MAX_VALUE;
        //     for(int j = i;j<n;j++){
        //         min = Math.min(min,arr[j]);
        //         sum+=min;
        //     }
        // }
        // return (int)(sum % mod);
        int [] pse = pse(arr);
        int [] nse = nse(arr);
        long total = 0;
        int mod = 1000000007;
        int n
         = arr.length;
        for(int i = 0;i<n ;i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            total += (long)left*right*arr[i];
       }
       return (int)(total%mod);
    }
}