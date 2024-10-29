import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String input = scan1.nextLine();

        Scanner scan2 = new Scanner(input);
        boolean isInt = false;

        while(is)

        try{
            scan2.nextInt();
            System.out.println("Success");
        } catch (InputMismatchException e){
            System.out.println("Please input an integer");
        }



    }
}