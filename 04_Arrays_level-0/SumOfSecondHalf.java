import java.util.Scanner;

public class SumOfSecondHalf {

    public static int calculateSum(int[] arr) {

        int mid = arr.length / 2;
        int sum = 0;

        for (int i = mid; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(calculateSum(arr));

        scanner.close();
    }
}