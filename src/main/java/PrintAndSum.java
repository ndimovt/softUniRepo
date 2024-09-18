import java.util.Scanner;

public class PrintAndSum {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        int start = inn.nextInt();
        int finish = inn.nextInt();
        int sum = 0;
        for (int i = start; i <= finish ; i++) {
            sum += i;
        }
        System.out.println("Sum "+ sum);
    }
}
