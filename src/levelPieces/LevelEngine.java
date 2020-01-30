package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelEngine {
	
	private int levelNum;
	private ArrayList<Moveable> t = new ArrayList<Moveable>();
	private Drawable[] temp = new Drawable[21];
//	ArrayList<Moveable> MovingPieces = 

	public void createLevel(int levelNum) {
		this.levelNum = levelNum;
		Minion m = new Minion('M',2);
		Doormat d = new Doormat();
		Unicorn u = new Unicorn('U',7);
		

//		t ;
//		temp ;

		t.add(m);
		t.add(u);
		temp[7] = u;
		temp[2] = m;
		temp[5] = d;
	}
	// request data structures from LevelEngine
	// returns the board and the pieces that show up on the board
	public Drawable [] getBoard(int size) {

		return temp;
	}
	// returns a list of the Moveable pieces for use outside of the board
	public ArrayList<Moveable> getMovingPieces(){

		return t;
	}
	public ArrayList<GamePiece> getInteractingPieces(){
		ArrayList<GamePiece> temp = new ArrayList<GamePiece>();
		return temp;
	}
	// reset player statistics, starting location determined
	// by level engine
	public int getPlayerStartLoc() {
		return 0;
	}
}
