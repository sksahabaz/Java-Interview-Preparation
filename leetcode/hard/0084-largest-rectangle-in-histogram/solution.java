import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Traverse all bars
        for (int i = 0; i < n; i++) {

            // Current bar is smaller, so calculate previous rectangles
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {

                int height = heights[st.pop()];
                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        // Process remaining bars
        while (!st.isEmpty()) {

            int height = heights[st.pop()];
            int width;

            if (st.isEmpty()) {
                width = n;
            } else {
                width = n - st.peek() - 1;
            }

            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}