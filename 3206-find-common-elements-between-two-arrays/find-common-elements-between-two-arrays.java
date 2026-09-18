class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] ans = new int[2];
        List <Integer> l1 = new ArrayList<>();
        List <Integer> l2 = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            l2.add(nums2[i]);
        }
        int c1 = 0;
        int c2 = 0;
        for(int i = 0;i < nums1.length;i++){
            if(l2.contains(nums1[i])) c1++;
        }
        for(int i = 0;i< nums2.length;i++){
            if(l1.contains(nums2[i])) c2++;
        }
        ans[0] = c1;
        ans[1] = c2;
        return ans;
    }
}