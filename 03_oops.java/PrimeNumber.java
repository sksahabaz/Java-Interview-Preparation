import java.util.Scanner;

public class PrimeNumber {

    static boolean checkPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (checkPrime(n))
            System.out.println("Yes");
        else
            System.out.println("No");

        scanner.close();
    }
}