import java.util.Scanner;

public class CofeePrice {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;
        int n = inn.nextInt();
        for (int i = 0; i < n; i++) {
            double price = inn.nextDouble();
            int days = inn.nextInt();
            int count = inn.nextInt();
            double total = price * days * count;
            System.out.printf("The price for the coffee is: $%.2f\n", total);
            sum += total;
        }
        System.out.printf("Total: $%.2f\n", sum);
    }
}
