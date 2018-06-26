package snake;

import controller.Controller;
import model.GameEngine;

public class SnakeGameEngine extends GameEngine
{
	@Override
	protected String setWindowTitle() { return "Snake"; }
	@Override
	protected int setWindowWidth() { return 320; }
	@Override
	protected int setWindowHeight() { return 320;}
	@Override
	protected Controller setController() { return new SnakeGameController();}

	public static void main(String[] args) { launch(args); }
}
