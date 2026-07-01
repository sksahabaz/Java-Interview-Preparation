import java.util.Scanner;

public class PrimeTillN {

    public static void primeTillN(int n) {

        for (int i = 2; i <= n; i++) {

            int count = 0;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        primeTillN(n);

        scanner.close();
    }
}