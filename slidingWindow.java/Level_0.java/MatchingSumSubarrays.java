import java.util.Scanner;

public class MatchingSumSubarrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;

        for (int i = 0; i <= arr.length - k; i++) {

            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum == m) {

                found = true;

                for (int x = i; x < i + k; x++) {
                    System.out.print(arr[x] + " ");
                }

                System.out.println();
            }
        }

        if (!found) {
            System.out.println("None");
        }

        scanner.close();
    }
}