import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(Math.abs(n));

        scanner.close();
    }
}