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
	
		public String printBoard() 
		{
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 9; i++) 
		{
            String symbol;
			
			if(board[i] == null)
			{
				symbol = " ";
			}
			else
			{
				symbol = board[i].getSymbol();
			}
            str.append(" " + symbol + " ");

            if((i + 1) % 3 == 0) 
			{
                str.append(i != 8 ? "\n---+---+---\n" : "\n");
            }
			else 
			{
                str.append("|");
            }
        }
        return str.toString();
    }
	
	public void insertSymbol(Player player, int input)
	{
		isValidMove(input);
		board[input] = player;
	}
	
	public Boolean isEmpty(int input)
	{
		isValidMove(input);
		return board[input] == null;
	}
}
