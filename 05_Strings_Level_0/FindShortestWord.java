import java.util.Scanner;

public class FindShortestWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] words = str.split(" ");

        String smallest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        System.out.println(smallest);

        scanner.close();
    }
}