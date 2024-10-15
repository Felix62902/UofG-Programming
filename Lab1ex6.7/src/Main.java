import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the first double");
        double first = scan.nextDouble();
        System.out.println("What's the second double?");
        double second = scan.nextDouble();

        int fit  = (int) (first/ second);
        double remain = first % second;

        System.out.println("It can fit in " + fit + " times with a remainder of " + remain);
    }
}