import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();

        System.out.printf("%.4f", 3.142 * r * r);

        scanner.close();
    }
}