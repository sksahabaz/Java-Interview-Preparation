public class MaximumVowelsInSubstring {

    public static void main(String[] args) {

        String s = "education";
        int k = 3;

        int count = 0;

        for (int i = 0; i < k; i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxCount = count;

        for (int i = k; i < s.length(); i++) {

            char left = s.charAt(i - k);

            if (left == 'a' || left == 'e' || left == 'i'
                    || left == 'o' || left == 'u') {
                count--;
            }

            char right = s.charAt(i);

            if (right == 'a' || right == 'e' || right == 'i'
                    || right == 'o' || right == 'u') {
                count++;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
    }
}