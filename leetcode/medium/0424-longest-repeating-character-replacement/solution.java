class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            frequency[index]++;

            maxFrequency = Math.max(maxFrequency, frequency[index]);

            while ((right - left + 1) - maxFrequency > k) {

                int leftIndex = s.charAt(left) - 'A';

                frequency[leftIndex]--;

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}