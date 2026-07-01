import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        if (n > m && n > l) {
            System.out.println(n);
        } else if (m > l) {
            System.out.println(m);
        } else {
            System.out.println(l);
        }

        scanner.close();
    }
}