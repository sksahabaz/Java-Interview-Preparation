class Solution {
    public int trap(int[] height) {
        

        int n = height.length;

        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int total = 0;

        while (left < right) {

            // Always process the smaller side
            if (height[left] <= height[right]) {

                // Water can only depend on leftMax
                if (height[left] >= leftMax) {

                    // Update left maximum
                    leftMax = height[left];

                } else {

                    // Water stored
                    total += leftMax - height[left];
                }

                left++;

            } else {

                // Water depends on rightMax
                if (height[right] >= rightMax) {

                    rightMax = height[right];

                } else {

                    total += rightMax - height[right];
                }

                right--;
            }
        }

        return total;
    


    }
}