package is.ru.tictactoe;

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
