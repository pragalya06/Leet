import java.util.*;
class Solution {
    int [] pse(int [] heights){
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int [] pse = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty()&& heights[i]<=heights[st.peek()]){
                st.pop();
            }
            pse[i] = st.isEmpty()?-1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    int [] nse(int[] heights){
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int [] nse = new int[n];
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return nse;
    }
    public int largestRectangleArea(int[] heights) {
        int [] nse = nse(heights);
        int [] pse = pse(heights);
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            max = Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        }
        return max;
        // int n=heights.length;
        // int [] pse = new int[n];
        // int [] nse = new int[n];
        // Arrays.fill(pse,0);
        // Arrays.fill(nse,n);
        // Stack <Integer> st = new Stack<>();
        // for(int i=0;i<n;i++)
        // {
        //     int curr=i;
        //     while(!st.isEmpty() && heights[st.peek()]>=heights[i])
        //     {
        //         st.pop();
        //     }
        //     if(!st.isEmpty()) pse[i]=st.peek()+1;
        //     st.push(curr);
        // }
        // for(int i=n-1;i>=0;i--)
        // {
        //     int curr=i;
        //     while(!st.isEmpty() && heights[st.peek()]>=heights[i])
        //     {
        //         st.pop();
        //     }
        //     if(!st.isEmpty()) nse[i]=st.peek();
        //     st.push(curr);
        // }
        // int max=0;
        // for(int i=0;i<n;i++)
        // {
        //     int area = heights[i]*(nse[i]-pse[i]);
        //     if(area>max)
        //     {
        //         max = area;
        //     }
        // }
        // return max;


    }
}