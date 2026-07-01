import java.util.Scanner;

public class SumCombinations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a + c);
        System.out.println(b + c);

        scanner.close();
    }
}