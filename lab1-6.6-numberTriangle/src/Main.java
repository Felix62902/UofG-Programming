import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the size of the triangle?");

        int size = scan.nextInt();
        printTriangle(size);
    }

    public static void printTriangle(int size){
        for(int i = 0; i < size; i++){
            printSpaces(size-(i+1));
            //print number
            printNumbers(i+1, i+1);
            System.out.println("");
        };
    }

    public static void printSpaces(int times){
        //print number of spaces without starting a new line
        for(int i = 0; i < times; i++){
            System.out.print(" ");
        }
    }

    public static void printNumbers(int number, int times){
        for(int i = 0; i < times; i++){
            System.out.print(number+" ");
        }
    }
}