import java.util.Scanner;

public class Vacation {
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0.0;
        int group = inn.nextInt();
        inn.nextLine();
        String type = inn.nextLine();
        String day = inn.nextLine();
        switch (type){
            case "Students":
                if(day.equals("Friday")){
                    if(group >= 30) {
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                } else if (day.equals("Saturday")) {
                    if(group >= 30) {
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                } else if (day.equals("Sunday")) {
                    if(group >= 30) {
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 8.45;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                }
                break;
            case "Business":
                if(day.equals("Friday")){
                    if(group >= 30) {
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                } else if (day.equals("Saturday")) {
                    if(group >= 30) {
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 10.90;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                }else if (day.equals("Sunday")) {
                    if(group >= 30) {
                        sum = group * 16;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 16;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 16;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                }
                break;
            case "Regular":
                if(day.equals("Friday")){
                    if(group >= 30) {
                        sum = group * 15;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 15;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 15;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                } else if (day.equals("Saturday")) {
                    if(group >= 30) {
                        sum = group * 20;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 20;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 20;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                } else if (day.equals("Sunday")) {
                    if(group >= 30) {
                        sum = group * 22.50;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }else if(group == 20){
                        sum = group * 22.50;
                        System.out.printf("%.2f", sum - sum * 0.05);
                        break;
                    }else{
                        sum = group * 22.50;
                        System.out.printf("%.2f", sum - sum * 0.15);
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }
}
