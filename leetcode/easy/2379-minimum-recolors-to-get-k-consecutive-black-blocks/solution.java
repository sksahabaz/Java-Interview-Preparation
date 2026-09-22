class Solution {
    public int minimumRecolors(String blocks, int k) {

        int left = 0;
        int whiteCount = 0;
        int minRecolors = Integer.MAX_VALUE;

        for (int right = 0; right < blocks.length(); right++) {

            // Add right element
            if (blocks.charAt(right) == 'W') {
                whiteCount++;
            }

            // Window reached size k
            if (right - left + 1 == k) {

                // Current window requires this many recolors
                minRecolors = Math.min(minRecolors, whiteCount);

                // Remove left element
                if (blocks.charAt(left) == 'W') {
                    whiteCount--;
                }

                // Move left
                left++;
            }
        }

        return minRecolors;
    }
}