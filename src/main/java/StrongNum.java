import java.util.Scanner;

public class StrongNum {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        int num = inn.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    }

