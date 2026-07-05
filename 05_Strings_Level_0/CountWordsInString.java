import java.util.Scanner;

public class CountWordsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(countWords(s));
    }

    public static int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }
}