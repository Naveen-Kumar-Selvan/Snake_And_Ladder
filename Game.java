
public class Game {
	private Board board;
	private Dice dice;
	private Player player1;
	private Player player2;
	
	public Game(Board board, Dice dice, Player player1, Player player2) {
		super();
		this.board = board;
		this.dice = dice;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void playGame() {
		player1.move(board, dice);
		player2.move(board, dice);
	}

}
