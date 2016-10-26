package is.ru.TicTacToe;

public class Board {
    private Player[] board;
	
	Board() 
	{
		board = new Player[9];
	}
	
	public void isValidMove(int input)
	{
		if(input < 0 || input >= 9)
		{
			throw new IndexOutOfBoundsException("Input " + input + " is not between 0 and 8!");
		}
	}
}
