import java.util.Scanner;

public class CelsiusToFahrenheit {

    static void celsiusToFahrenheit(int celsius) {

        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.print(fahrenheit);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int celsius = scanner.nextInt();

        celsiusToFahrenheit(celsius);

        scanner.close();
    }
}