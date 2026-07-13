public class LongestWordUsingSubstring {

    public static void main(String[] args) {

        String str = "Java is the best programming language";

        String longest = "";
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                String word = str.substring(start, i);

                if (word.length() > longest.length()) {
                    longest = word;
                }

                start = i + 1;
            }
        }

        System.out.println("Longest Word: " + longest);
    }
}