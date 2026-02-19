package Day_7;
import java.util.Scanner;

public class tic_tac_toe_game {
    //method for printing the board
    public static void printbox(char[][] board){
        for(int i=0; i < 3; i++){
            for(int j=0; j<3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    //method for checking the board
    public static boolean checking(char[][] board){
        for(int i = 0; i < 3; i++){

            //row and column check
            if((board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) ||
                (board[0][i] != ' ' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i])){
                return true;
            }
        }
         
        //diagonal 1 check
        if(board[0][0] != ' ' &&
           board[0][0] == board[1][1] &&
           board[1][1] == board[2][2]){
            return true;
        }

        //diagonal 2 check
        if(board[0][2] != ' ' &&
           board[0][2] == board[1][1] &&
           board[1][1] == board[2][0]){
            return true;
        }
       
        return false;
    }
   
     //main method
    public static void tic_tac_toe_game(String[] args){
       
        int times = 1;
        int moves = 0;
       
        char[][] board = new char[3][3];
        Scanner input = new Scanner(System.in);

        // initialize board with empty spaces
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }

        System.out.println("WELCOME TO THE XO GAME........");
       
        while(true){

            int row;
            int col;

            //X turn
            if(times % 2 != 0){
                System.out.println("X turn (enter row and column): ");
            }

            //O turn
            else{
                System.out.println("O turn (enter row and column): ");
            }

            row = input.nextInt();
            col = input.nextInt();

            //check valid range
            if(row < 0 || row >= 3 || col < 0 || col >= 3){
                System.out.println("Enter values between 0 and 2");
                continue;
            }

            //check if cell already filled
            if(board[row][col] != ' '){
                System.out.println("Cell already occupied! try again");
                continue;
            }

            if(times % 2 != 0){
                board[row][col] = 'X';
            }
            else{
                board[row][col] = 'O';
            }

            moves++;

            printbox(board);

            //check winner
            if(checking(board)){
                if(times % 2 != 0)
                    System.out.println("X wins!!!");
                else
                    System.out.println("O wins!!!");
                break;
            }

            //check draw
            if(moves == 9){
                System.out.println("It's a Draw!");
                break;
            }

            times++;
        }
    }
    
}
