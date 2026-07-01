import java.util.Scanner;

public class FirstNPrimes {

    public static void printFirstNPrimes(int n) {

        int count = 0;
        int num = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printFirstNPrimes(n);

        scanner.close();
    }
}