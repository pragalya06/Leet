class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int r =0,l = 0,max = 0;
        while(r < fruits.length){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            if(mp.size() > 2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l]) == 0) mp.remove(fruits[l]);
                l++; 
            }
            if(mp.size() <= 2){
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}