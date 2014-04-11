package rebooted;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
/**
 * Creates the screen if the user wins the game.
 * @author danielstratton
 *
 */
public class GameWon extends BasicGameState{
	/**
	 * Declares all the needed images.
	 */
	private Image background, title;
	/**
	 * Blank constructor for the state
	 * @param state
	 */
	public GameWon(int state){
	}
	/**
	 * Instantiates the images.
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @throws SlickException
	 */
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		background = new Image("res/gamewonbackground.png");
		title = new Image("res/gamewon.png");
	}
	/**
	 * Renders the images to the screen
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @param Graphics g
	 * @throws SlickException
	 */
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		g.drawImage(background,200,350);
		g.drawImage(title,75,100);
	}
	/**
	 * If the key m is press it will take the user to the main menu.
	 */
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		Input in = arg0.getInput();
		if(in.isKeyDown(Input.KEY_M)){
			arg1.enterState(0);
		}
	}
	/**
	 * Returns the id of the state.
	 */
	public int getID() {
		return 5;
	}

}
