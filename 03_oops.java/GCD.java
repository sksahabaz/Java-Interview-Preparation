import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        while (m != 0) {
            int rem = n % m;
            n = m;
            m = rem;
        }

        System.out.println(n);

        scanner.close();
    }
}