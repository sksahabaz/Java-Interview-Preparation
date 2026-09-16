import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();
        int j = 0;

        for (int value : pushed) {
            st.push(value);

            while (!st.isEmpty() && j < popped.length
                    && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}