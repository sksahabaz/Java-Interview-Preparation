import java.util.Scanner;

public class LastOccurrence {

    public static int lastOccurrenceFinder(int[] arr, int key) {

        int last = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == key) {
                last = i;
                break;
            }
        }

        return last;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int key = scanner.nextInt();

        int result = lastOccurrenceFinder(arr, key);

        System.out.print(result);

        scanner.close();
    }
}