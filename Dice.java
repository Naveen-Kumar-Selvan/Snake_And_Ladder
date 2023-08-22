import java.util.Random;

public class Dice {
	
	private static volatile Dice diceInstance;

	Random randomNumber = new Random();
	
	private Dice() {
		
	}
	
	public static Dice getDiceInstance() {
		if(diceInstance == null) {
			synchronized (Dice.class) {
				if(diceInstance == null) {
					diceInstance = new Dice();
				}
			}
		}
		
		return diceInstance;
	}

	public int rollDice() {
		int num = 0;
		// Random randomNumber= new Random();
		num = randomNumber.nextInt(7);
		return num;
	}

}
