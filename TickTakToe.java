import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Final HW TicTacToe
 *
 * Hemza Al-Shamari
 * CS-142
 */
public class TickTakToe
{
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>(); 
    static ArrayList<Integer> player2Positions = new ArrayList<Integer>(); 
    public static void main (String [] args){

        System.out.println("Hello and welcome to tictactoe. This is a 1 player game. You are X");
        System.out.println("Please enter a number from 1-9 to enter your placement on the board."); 
        System.out.println("Each time you insert X, it will print on a new board with your answe followed by a new board with computer's answer");
        System.out.println("in case you are confused on why so many boards are printing. Enjoy. (:");
        char [][] gameBoard = { {' ', '|', ' ','|', ' '}, //1. printing out gameboard using 2d array of chars
                  {'-', '+', '-','+', '-'},
                  {' ', '|', ' ','|', ' '},
                  {'-', '+', '-','+', '-'},
                  {' ', '|', ' ','|', ' '}};
        printingGameBoard(gameBoard);
         while(true){ //while true statement which will loop the game each time a position is played
        try{ //2. using a try catch if user enters a string it will print out please enter a valid number
            Scanner sc = new Scanner(System.in);
            int playerPos = sc.nextInt();
            while(playerPositions.contains(playerPos) || player2Positions.contains(playerPos)){
                System.out.println("This position is taken, please use an available slot.");
                playerPos = sc.nextInt();
      
            }
            placingPieces(gameBoard, playerPos,"player");
            printingGameBoard(gameBoard);
            String result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int player2Pos = rand.nextInt(9) + 2;
            while(playerPositions.contains(player2Pos) || player2Positions.contains(player2Pos)){
                player2Pos = rand.nextInt(9) + 2;
            }
            placingPieces(gameBoard, player2Pos,"player2");
            printingGameBoard(gameBoard);
            String result2 = checkWinner();
            
            if(result2.length() > 0){
                System.out.println(result2);
                break;
            }
            
        }
        catch(Exception e){
        System.out.print("Please enter a valid number.");
        }
    
        }
    
    }
    public static void printingGameBoard(char[][] gameBoard){//3. Using a new method. 
        for( char [] row: gameBoard){//4.using a for loop and 5. using a nested for loop that will print out my game board
                for(char c: row){
                    System.out.print(c);
                }
                System.out.println();
            }
        
    }
    public static void placingPieces(char[][] gameBoard, int pos, String user){
        //6. using if statement which says if user is player 1 print X and if user is player 2 print O
        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        }
        else if(user.equals("player2")){
            symbol = 'O';
            player2Positions.add(pos);
        }
        
        
        switch(pos){ //using switch statements to place X in it's exact position
                case 1: 
                    gameBoard[0][0] = symbol; 
                    break;
                case 2: 
                    gameBoard[0][2] = symbol;
                    break;
                case 3: 
                    gameBoard[0][4] = symbol; 
                    break;
                case 4: 
                    gameBoard[2][0] = symbol;
                    break;
                case 5: 
                    gameBoard[2][2] = symbol;
                    break;
                case 6: 
                    gameBoard[2][4] = symbol;
                    break;
                case 7: 
                    gameBoard[4][0] = symbol;
                    break;
                case 8: 
                    gameBoard[4][2] = symbol;
                    break;
                case 9: 
                    gameBoard[4][4] = symbol;
                    break;
                default:
                    break;
        }
        }
    public static String checkWinner(){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List rightCol = Arrays.asList(3, 6, 9);
        List midCol = Arrays.asList(2, 5, 8);
        List leftCol = Arrays.asList(1, 4, 7);
        List cross = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);
        
        List <List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(rightCol);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(cross);
        winning.add(cross2);
        for(List i : winning){
            if(playerPositions.containsAll(i)){
                return "Congrats, you have won";
            }
            else if(player2Positions.containsAll(i)){
                return "Sorry, you have lost";
            }
            else if(playerPositions.size() + player2Positions.size() == 10){
                return "It's a draw";
            }
            }
        return "";
    }

    }


