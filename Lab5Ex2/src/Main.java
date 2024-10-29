import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        Scanner s = null;
        try{
            String fN = "C:/Users/User/Downloads/sums.txt";
            fr = new FileReader(fN);
            s = new Scanner(fr);
            while(s.hasNextLine()){
                String line = s.nextLine();
//                System.out.println(line);
                String[] equation = line.split(" ");
                String symbol = equation[1];
                int val1 = Integer.valueOf(equation[0]);
                int val2 = Integer.valueOf(equation[2]);
                if(symbol.equals("+")){
                    System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
                }else if (symbol.equals("-")){
                    System.out.println(val1 + "-" + val2 + "=" + (val1 - val2));
                } else {
                    System.out.println("Error: unable to perform operation");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                fr.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}