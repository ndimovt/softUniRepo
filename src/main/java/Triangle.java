import java.util.Scanner;

public class Triangle {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        int num = inn.nextInt();
        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
