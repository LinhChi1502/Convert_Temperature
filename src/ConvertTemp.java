import java.util.Scanner;

public class ConvertTemp {
    public static double celsiusToFaraheit(double celsius) {
        double faraheit = (9.0 / 5) * celsius + 32;
        return faraheit;
    }
    public static double faraheitToCelsius(double faraheit) {
        double celsius = (5.0 / 9) * (faraheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. celsius to faraheit");
            System.out.println("2. faraheit to celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter celsius: ");
                    double celsiusInput = sc.nextDouble();
                    System.out.println(celsiusToFaraheit(celsiusInput));
                    break;
                case 2:
                    System.out.println("Enter faraheit: ");
                    double faraheitInput = sc.nextDouble();
                    System.out.println(faraheitToCelsius(faraheitInput));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
