package is.TicTacToe;

import java.util.Scanner;


public class ConsoleUI{
    private Board board;
    private Scanner sc;

    ConsoleUI()
    {
		board = new Board();
		sc = new Scanner(System.in);
    }

    public int getInt(String str)
    {
		try
		{
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
    }
}
