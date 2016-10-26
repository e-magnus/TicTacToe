package is.ru.TicTacToe;

public class Player {
    private String nickname;
	private String symbol;
	
	Player(String nick, String symb)
	{
		setNickname(nick);
		setSymbol(symb);
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public void setNickname(String nick)
	{
		nickname = nick;
	}
	
	public void setSymbol(String symb)
	{
		symbol = symb.substring(0, 1);
	}
}
