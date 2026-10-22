
class Solution {

    public static int[] applyOperations(int[] nums) {

        int i = 0;
        int j = 1;

        // Step 1: Apply operations
        while (j < nums.length) {

            if (nums[i] == nums[j]) {
                nums[i] = nums[i] * 2;
                nums[j] = 0;
            }

            i++;
            j++;
        }

        // Step 2: Move zeroes to the end
        return moveszerosToend(nums);
    }

    public static int[] moveszerosToend(int[] nums) {

        int i = 0;
        int j = 1;

        while (j < nums.length) {

            if (nums[i] == 0 && nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;

            } else if (nums[i] != 0) {
                i++;
                j++;

            } else {
                j++;
            }
        }

        return nums;
    }
}
