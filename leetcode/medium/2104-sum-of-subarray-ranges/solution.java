import java.util.Stack;

class Solution {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        long maxSum = getMaxContribution(nums, n);
        long minSum = getMinContribution(nums, n);

        return maxSum - minSum;
    }

    // Sum of contributions when each element acts as MAXIMUM
    private long getMaxContribution(int[] nums, int n) {

        int[] prevGreater = new int[n];
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Greater (strictly greater)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            prevGreater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater (greater or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            nextGreater[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - prevGreater[i];
            long right = nextGreater[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }

    // Sum of contributions when each element acts as MINIMUM
    private long getMinContribution(int[] nums, int n) {

        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Smaller (strictly smaller)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Smaller (smaller or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - prevSmaller[i];
            long right = nextSmaller[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }
}