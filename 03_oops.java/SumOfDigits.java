import java.util.Scanner;

public class SumOfDigits {

    public static int findSumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int sum = findSumOfDigits(num);

        System.out.println(sum);

        scanner.close();
    }
}