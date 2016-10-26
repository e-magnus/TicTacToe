package is.ru.TicTacToe;


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
			webui.setup();
		}
		else{
			System.out.println("Þetta er console");
		}
	}
}
