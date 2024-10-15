// a program that computes all the prime numbers between 2 and N
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number");
        int num = scan.nextInt();
        scan.nextLine();
        getPrimes(num);
        scan.close();
    }

    public static void getPrimes(int N){
        // // Create a list of numbers from 2 to N
        ArrayList<Integer> allNums = new ArrayList<>();
        for (int i = 2; i < N+1; i++){
            allNums.add(i);
        }

        // Implement the prime number sieve using ArrayList
        for(int i = 0; i< allNums.size(); i++){
            int prime = allNums.get(i);

            // start removing multiples of the prime
            for(int j = i + 1; j < allNums.size(); j++){
                if(allNums.get(j) % prime == 0 ){
                    allNums.remove(j);
//                    j--;
                }
            }
        }
        // Output the remaining prime numbers
        System.out.println("Prime numbers between 2 and " + N + ": " + allNums);
        //list all numbers between 2 and N in a storage
    }
}