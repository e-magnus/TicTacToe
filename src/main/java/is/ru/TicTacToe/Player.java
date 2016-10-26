package is.ru.TicTacToe;

public class Player {
    private String nickname;
	private String symbol;
	
	Player(String nick, String symb)
	{
		nickname = nick;
		symbol = symb;
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
}
