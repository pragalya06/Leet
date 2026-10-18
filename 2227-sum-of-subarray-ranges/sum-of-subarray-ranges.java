class Solution {
    int [] nse (int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nse [] = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            nse [i] = st.isEmpty() ? n :st.peek();
            st.push(i);
        }
        return nse;
    }
    int [] psee(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int psee [] = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }
    int [] ngee(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ngee [] = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            ngee [i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ngee;
    }
    int [] pge(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int pge [] = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            pge [i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }
    long sumofsubarraymin(int [] arr){
        int n = arr.length;
        int [] nse = nse(arr);
        int [] psee = psee(arr);
        long total = 0;
        for(int i = 0;i<n;i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            total+=(long)left*right*arr[i];
        }
        return total;

    }
    long sumofsubarraymax(int [] arr){
        int n = arr.length;
        int [] ngee = ngee(arr);
        int [] pge = pge(arr);
        long total = 0;
        for(int i = 0;i<n;i++){
            int left = i - pge[i];
            int right = ngee[i] - i;
            total += (long)left*right*arr[i];
        }
        return total;
    }
    public long subArrayRanges(int[] arr) {
        return sumofsubarraymax(arr) - sumofsubarraymin(arr) ;



        // Brute Force

        // int n = nums.length;
        // long total = 0;
        // for(int i = 0;i< n ;i++){
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     for(int j = i;j<n;j++){
        //         max = Math.max(max,nums[j]);
        //         min =Math.min(min,nums[j]);
        //         total += (max-min);
        //     }
        // }
        // return total;
    }
}