public class Player {

	@SuppressWarnings("unused")
	private String playerName;
	private int playerPosition;
	private int diceValue;
	
	public Player(String name) {
		this.playerName = name;
		this.playerPosition = 0;
	}
	
	public void move(Board board, Dice dice) {
		diceValue = dice.rollDice();
		playerPosition = board.newPlayerPosition(playerPosition, diceValue);
	}
	
	public int getPlayerPostion() {
		return playerPosition;
	}
}
