import java.util.Scanner;

public class Ages {
    private static Scanner inn = new Scanner(System.in);
    public static void main(String[] args) {
        int age = inn.nextInt();
        if(age >= 0 && age <= 2){
            System.out.println("baby");
        } else if (age >=3 && age <= 13) {
            System.out.println("child");
        } else if (age >=14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >=20 && age <= 65) {
            System.out.println("adult");
        }else{
            System.out.println("elder");
        }
    }
}
