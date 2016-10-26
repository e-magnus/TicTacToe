package is.ru.tictactoe;

public class Board {
    private Player[] board;
	
	Board() {
		board = new Player[9];
	}
	
	/*public void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = 'X';
        }
    }*/
	
	public void isValidMove(int input)
	{
		if(input < 0 || input >= 9)
		{
			throw new OutOfBoundsException("Input " + input + " is not between 0 and 8!");
		}
	}
}
