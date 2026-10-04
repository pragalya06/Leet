class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[255];

        for (int i = 0; i < 255; i++) {
            hash[i] = -1;
        }

        int len = 0;
        int r = 0, l = 0;

        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1 && hash[s.charAt(r)] >= l) {
                l = hash[s.charAt(r)] + 1;
            }

            len = Math.max(len, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }

        return len;
    }
}