import java.util.Scanner;

public class Password {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        String username = inn.nextLine();
        StringBuilder sb = new StringBuilder(username).reverse();
        do{
            String pass = inn.nextLine();
            if(pass.contentEquals(sb)){
                System.out.println("User "+username+" logged in.");
            }else{
                System.out.println("Incorrect password.Try again.");
                count++;
            }if(count == 4){
                System.out.println("User "+username+" blocked!");
            }
        }while (count < 5);
    }
}
