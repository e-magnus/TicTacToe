package is.ru.TicTacToe;

public class Board {
    private char [] board;
	
	Board() {
		
	}
	public void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = 'X';
        }
    }
}
