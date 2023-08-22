import java.util.HashMap;

public class SnakeMovement implements PlayerMovementStrategy {

	private static HashMap<Integer, Integer> snakes = new HashMap<>();
	{
		snakes.put(99, 54);
		snakes.put(70, 55);
		snakes.put(25, 2);
		snakes.put(95, 7);
	}

	public boolean isSnakePresent(int currentNumber) {
		if (snakes.containsKey(currentNumber)) {
			return true;
		}

		return false;
	}

	@Override
	public int newPlayerPosition(int playerCurrentPosition, int diceValue) {
		int newPosition = playerCurrentPosition + diceValue;

		if (isSnakePresent(newPosition)) {
			return snakes.get(newPosition);
		}

		return newPosition;
	}
}
