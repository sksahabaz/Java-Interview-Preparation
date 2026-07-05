import java.util.Scanner;

public class CharacterAtGivenIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int index = scanner.nextInt();

        if (index < 0 || index >= input.length()) {
            System.out.println("Invalid index");
        } else {
            System.out.println(input.charAt(index));
        }
    }
}