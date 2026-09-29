class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int base = 0;

        // Customers who are already satisfied
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        int windowSum = 0;
        int maxWindow = 0;
        int left = 0;

        // Fixed-size sliding window
        for (int right = 0; right < customers.length; right++) {

            // Add newly included unsatisfied customers
            if (grumpy[right] == 1) {
                windowSum += customers[right];
            }

            // Keep window size <= minutes
            if (right - left + 1 > minutes) {

                if (grumpy[left] == 1) {
                    windowSum -= customers[left];
                }

                left++;
            }

            // Maximum customers we can recover
            maxWindow = Math.max(maxWindow, windowSum);
        }

        return base + maxWindow;
    }
}