package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Sniper extends GamePiece implements Moveable {

	Sniper(char symbol, int location){
		super(symbol, location);
	}
	
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub

	}
}
