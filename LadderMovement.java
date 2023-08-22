import java.util.HashMap;

public class LadderMovement implements PlayerMovementStrategy{
	
	private static HashMap <Integer, Integer> ladder = new HashMap<>();
	{
	ladder.put(6, 25);
	ladder.put(60, 85);
	ladder.put(46, 90);
	ladder.put(17, 69);
	}
	
	public boolean isLadderPresent(int currentNumber) {
		if(ladder.containsKey(currentNumber)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int newPlayerPosition(int playerCurrentPosition, int diceValue) {
		int newPosition = playerCurrentPosition + diceValue;

		if (isLadderPresent(newPosition)) {
			return ladder.get(newPosition);
		}

		return newPosition;
	}

}
