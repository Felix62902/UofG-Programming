import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide an integer");
        int num = scan.nextInt();
        scan.nextLine();

        int ones = num%10;
        int tens =  (num%100 - ones)/10;
        int hundreds = (num - tens - ones)/100;

        if(Math.pow(ones,3)+ Math.pow(tens,3)+ Math.pow(hundreds,3)==num){
            System.out.println(num+ " is an Armstrong number" );
        } else {
            System.out.println(num+ " is not an Armstrong number" );
        }
    }
}