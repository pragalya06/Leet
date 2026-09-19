class Solution {
    int bsearch(int [] nums,int target,boolean isfirst){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isfirst) end = mid-1;
                else start = mid+1;
            }
            else if(target > nums[mid]) start = mid+1;
            else end = mid -1;
        }
        return ans;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List <Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int first = bsearch(nums,target,true);
        int last = bsearch(nums,target,false);
        if(first ==-1) return ans;
        for(int i = first;i <= last ;i++){
            ans.add(i);
        }
        return ans;
        
    }
}