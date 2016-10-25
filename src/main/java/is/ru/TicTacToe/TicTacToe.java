package is.ru.tictactoe;


public class TicTacToe {
    public static void main(String[] args) {
		Boolean web = false;
		if (args.length > 0) {
            if (args[0].equals("web")) {
                web = true;
            }
        }
		
		if(web){
			TicTacToeWebUI  webui = new TicTacToeWebUI();
		}
		else{
			System.out.println("Þetta er console");
		}
	}
}
