import java.util.Scanner;

public class LargestElementFrequency {

    public static int occurrenceOfLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = occurrenceOfLargest(arr);

        System.out.print(result);

        scanner.close();
    }
}