class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int start = 0;

        while (start < chars.length) {

            int end = start;

            // Find the end of the current word
            while (end < chars.length && chars[end] != ' ') {
                end++;
            }

            // Reverse current word
            int left = start;
            int right = end - 1;

            while (left < right) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            // Move to next word
            start = end + 1;
        }

        return new String(chars);
    }
}