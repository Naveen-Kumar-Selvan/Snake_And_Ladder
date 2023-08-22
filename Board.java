//Singleton Class as there will be only one board throughout the game
public class Board {
	
	private static volatile Board board;
	@SuppressWarnings("unused")
	private int size;
	private PlayerMovementStrategy playerMovementStrategy;
	
	private Board() {
		size = 100;
		playerMovementStrategy = new NormalMovement();
	}
	
	public static Board getBoardInstance() {
		if(board == null) {
			synchronized (Board.class) {
				if(board == null) {
					board = new Board();
				}
			}
		}
		
		return board;
		
	}
	
	public void setPlayerMovementStrategy(PlayerMovementStrategy movementStrategy) {
		this.playerMovementStrategy = movementStrategy;
	}
	
	public int newPlayerPosition(int playerCurrentPosition, int diceValue) {
		return playerMovementStrategy.newPlayerPosition(playerCurrentPosition, diceValue);
	}

}
