import java.util.Scanner;
import java.util.Random;

public class milestone1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[][] board = new String[5][10];
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 10; j++)
                board[i][j] = "[]";

        final int X = rand.nextInt(10);
        final int Y = rand.nextInt(5);
        int x;
        int y;
        printBoard(board);
        boolean guess = false;

        do {
            System.out.print("\nEnter a set of x and y coordinates between 0 and 9: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if(x == X && y == Y) {
                board[y][x] = "[O]";
                guess = true;
            } else
                board[y][x] = "[X]";
            printBoard(board);
            System.out.println("KEEP GUESSING!");
        } while(!guess);

        System.out.println("You guessed correctly!");
    }

    public static void printBoard(String[][] board) {
        System.out.print("  ");
        for(int i = 0; i < 10; i++)
            System.out.print("\t " + i);
        System.out.println();

        for(int i = 0; i < 5; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                System.out.print("\t" + board[i][j]);
            }
            System.out.println();
        }
    }
}