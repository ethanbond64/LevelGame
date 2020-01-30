package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.*;
import java.lang.Math;

public class Unicorn extends GamePiece implements Moveable {

	Unicorn(char symbol, int location){
		super(symbol, location);
	}
	
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int loc = playerLocation;
		while(gameBoard[loc] != null) {
			double random = Math.random();
			int randint = (int) (random*20 +1);
			loc = randint;
			
		}
		this.setLocation(loc);
	}

}
