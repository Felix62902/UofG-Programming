import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] Game = new char[3][3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < Game.length; i++) {
            for (int j = 0; j < Game[i].length; j++) {
                Game[i][j] = '.';
                System.out.print(Game[i][j] + " ");
            }
            System.out.println();
        }

//        Mechanism to switch between player 1 and 2
        boolean player1 = true;

        while (true){

            if(player1){
                System.out.println("Player 1, give me a coordinate in this format (x,y), you are represented by X");
            } else {
                System.out.println("Player 2, give me a coordinate in this format (x,y), you are represented by O");
            }

            String coord = scan.nextLine();
            if (coord.equals("end")){
                break;
            }

            String[] split = coord.split(",");
            int xcoord = Integer.valueOf(split[0]);
            int ycoord = Integer.valueOf(split[1]);

            if(Game[xcoord][ycoord]=='X' || Game[xcoord][ycoord] =='O'){
                continue;
            }
            if (player1){
                Game[xcoord][ycoord] = 'X';
            } else {
                Game[xcoord][ycoord] = 'O';
            }


            for (int i = 0; i < Game.length; i++) {
                for (int j = 0; j < Game[i].length; j++) {
                    System.out.print(Game[i][j] + " ");
                }
                System.out.println();
            }
            player1 = !player1;
        }
    }
}