class Solution {
    public int[] asteroidCollision(int[] as) {
        ArrayList<Integer> st = new ArrayList<>();

        for (int i = 0; i < as.length; i++) {
            if (as[i] > 0) {
                st.add(as[i]);
            } else {
                boolean alive = true;

                while (alive && !st.isEmpty() && st.get(st.size() - 1) > 0) {
                    int top = st.get(st.size() - 1);

                    if (top < Math.abs(as[i])) {
                        st.remove(st.size() - 1);
                    } else if (top == Math.abs(as[i])) {
                        st.remove(st.size() - 1);
                        alive = false;
                    } else {
                        alive = false;
                    }
                }

                if (alive) {
                    st.add(as[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}