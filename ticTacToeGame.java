package ticTacToeGame;

//TicTacToe Game using Java Programming Language
//Player 'X' v/s Player 'O'

import java.util.Scanner;

public class ticTacToeGame {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int input;
	char pos[] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	char turn ='X';
	int currentTurn = 1;
	
	while(true) {
		
		do { 
			System.out.println("\nEnter a position: ");
			input = scanner.nextInt();
		}while(pos[input - 1] == 'X' || pos[input - 1] == 'O');
		pos[input-1] = turn;
		System.out.println("\n"+" "+pos[0]+" | "+pos[1]+" | "+pos[2]);
		System.out.println("---+---+---");
		System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]);
		System.out.println("---+---+---");
		System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]);
		
		
		if( pos[0] == turn && pos[1] == turn && pos[2] == turn
				|| pos[3] == turn && pos[4] == turn && pos[5] == turn
				|| pos[6] == turn && pos[7] == turn && pos[8] == turn
				|| pos[0] == turn && pos[3] == turn && pos[6] == turn
				|| pos[1] == turn && pos[4] == turn && pos[7] == turn
				|| pos[2] == turn && pos[5] == turn && pos[8] == turn
				|| pos[0] == turn && pos[4] == turn && pos[8] == turn
				|| pos[2] == turn && pos[4] == turn && pos[6] == turn
				) {
			System.out.println("\n"+turn+" is the Winner ! \n");
			break;
		}		
		
		if(turn == 'X') {
			turn = 'O';
		}
		else if(turn == 'O') {
			turn = 'X';
		}
		currentTurn++;
		if(currentTurn  > 9) {
			System.out.println("\nDraw !!!\n");
			break;
		}
	
	}
    scanner.close();  	
} 
}
