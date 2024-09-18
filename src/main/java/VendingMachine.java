import java.util.Scanner;

public class VendingMachine {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        double total = 0.0;
        String input = null;
        do{
            input = inn.nextLine();
            if(!input.equals("Start")){
                if(input.equals("0.1")) {
                    total += Double.parseDouble(input);
                } else if (input.equals("0.2")) {
                    total += Double.parseDouble(input);
                } else if (input.equals("0.5")) {
                    total += Double.parseDouble(input);
                } else if (input.equals("1.0") || input.equals("1")) {
                    total += Double.parseDouble(input);
                } else if (input.equals("2.0") || input.equals("2")) {
                    total += Double.parseDouble(input);
                }else{
                    System.out.println("Cannot accept "+input+" 0");
                }
            }
        }while (!input.equals("Start"));
        do{
            input = inn.nextLine();
            if(input.equals("Nuts")){
                if(total -2.0 >= 0){
                    total -= 2.0;
                    System.out.println("Purchased "+input);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if(total - 0.7 >= 0){
                    total -= 0.7;
                    System.out.println("Purchased "+input);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if(total - 1.5 >= 0){
                    total -= 1.5;
                    System.out.println("Purchased "+input);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if(total - 0.8 >= 0){
                    total -= 0.8;
                    System.out.println("Purchased "+input);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {

                if(total -1 >= 0){
                    total -= 1;
                    System.out.println("Purchased "+input);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }
        }while (!input.equals("End"));
        System.out.println(total > 0.10? "Change: "+total : "Change: "+total + "0");
    }
}
