import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer or double");
        double num = scan.nextDouble();
        if ((num*10)%10 ==0){
            timesTable((int) num);
        } else {
            timesTable(num);
        }


        System.out.println("End");
    }

    public static void timesTable(double num){
        for (int i = 0; i < 100; i++){
            String count = String.format("%10.3f",num*i);
            System.out.printf(num + " x " + i + " = " + count + "\n");
        }
    }

    public static void timesTable(int num){
        for (int i = 0; i < 100; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}

