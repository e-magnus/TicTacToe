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
        StringBuilder theBoard = new StringBuilder();
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
            theBoard.append(" " + symbol + " ");

            if((i + 1) % 3 == 0) 
			{
                theBoard.append(i != 8 ? "\n---+---+---\n" : "\n");
            }
			else 
			{
                theBoard.append("|");
            }
        }
        return theBoard.toString();
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
	
	public Boolean isWinner(Player p)
	{
		/*Horizontal*/
		for(int i = 0; i < 9; i += 3)
		{
			return(p == board[i] && p == board[i + 1] && p == board[i + 2]);
		}
		/*Vertical*/
		for(int i = 0; i < 9; i++)
		{
			return(p == board[i] && p == board[i + 3] && p == board[i + 6]);
		}
		/*Diagonal*/
		return(p == board[0] && p == board[4] && p == board[8]) ||
		      (p == board[2] && p == board[4] && p == board[6]);
	}
	
	public void clearBoard()
	{
		for(int i = 0; i < 9; i++)
		{
			board[i] = null;
		}
	}
	
	public Boolean isDraw()
	{
		for(int i = 0; i < 9; i++)
		{
			if(board[i] == null)
			{
				return false;
			}
		}
		return true;
	}
}
