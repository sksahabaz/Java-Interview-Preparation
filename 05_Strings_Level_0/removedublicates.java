import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            boolean found = false;

            for (int j = 0; j < result.length(); j++) {

                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result = result + ch;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}