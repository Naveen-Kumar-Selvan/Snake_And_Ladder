//Singleton Class

public class GameFactory {
	private static volatile GameFactory gameInstance;
	
	private GameFactory() {
		
	}
	
	public static GameFactory getInstance() {
		if(gameInstance == null) {
			synchronized(GameFactory.class) {
				if(gameInstance == null) {
					gameInstance = new GameFactory();
				}
			}
		}
		
		return gameInstance;
	}
	
	public Game startGame() {
		Board board = Board.getBoardInstance();
		Dice dice = Dice.getDiceInstance();
		Player player1 = new Player("Pl_1");
		Player player2 = new Player("Pl_2");
		
		return new Game(board, dice, player1, player2);
	}

}
