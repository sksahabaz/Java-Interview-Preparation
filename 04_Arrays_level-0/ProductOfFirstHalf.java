import java.util.Scanner;

public class ProductOfFirstHalf {

    public static void calculateProduct(int[] arr) {

        int mid = arr.length / 2;
        int product = 1;

        for (int i = 0; i < mid; i++) {
            product *= arr[i];
        }

        System.out.print(product);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        calculateProduct(arr);

        scanner.close();
    }
}