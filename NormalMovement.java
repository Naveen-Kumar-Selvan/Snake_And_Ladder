
public class NormalMovement implements PlayerMovementStrategy {

	@Override
	public int newPlayerPosition(int playerCurrentPosition, int diceValue) {
		return playerCurrentPosition + diceValue;
	}

}
