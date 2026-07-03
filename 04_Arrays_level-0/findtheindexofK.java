import java.util.*;

public class Main {

    public static void findtheindexofK(int arr[], int K) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                System.out.print(i);
                return;
            }
        }

        System.out.print(-1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int K = scanner.nextInt();

        findtheindexofK(arr, K);

        scanner.close();
    }
}