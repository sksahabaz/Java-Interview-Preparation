import java.util.Scanner;

public class PrimeInRange {

    public static void printPrimeNumbers(int n1, int n2) {

        for (int i = n1; i <= n2; i++) {

            if (i < 2)
                continue;

            int count = 0;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        printPrimeNumbers(n1, n2);

        scanner.close();
    }
}