public class Main {
    public static void main(String[] args) {
        int n = 6;


        int[][] array2D = new int[n][n];
        for (int i = 0; i < array2D.length; i++){
//            PRINT 0 I TIMES WITHOUT SWITCHING LINES
            printZeroes(i);
            for ( int j = 0; j < array2D[i].length - i ; j ++){
                array2D[i][j] = j+1;
                System.out.print(array2D[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void printZeroes(int amount){
        for (int i = 0; i< amount; i++){
            System.out.print(0 + "   ");
        }
    }
}