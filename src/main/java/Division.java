import java.util.Scanner;

public class Division {
    private static Scanner inn = new Scanner(System.in);
    public static void main(String[] args) {
        int num = inn.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is divisible by "+2);
            if (num % 3 == 0) {
                System.out.println("The number is divisible by " + 3);
                if (num % 3 == 0 && num % 2 == 0) {
                    System.out.println("The number is divisible by "+6);
                }
                if (num % 7 == 0) {
                    System.out.println("The number is divisible by "+7);
                }
                if (num % 10 == 0) {
                    System.out.println("The number is divisible by "+10);
                }
            }
        }else{
            System.out.println("Not divisible");
        }
    }
}
