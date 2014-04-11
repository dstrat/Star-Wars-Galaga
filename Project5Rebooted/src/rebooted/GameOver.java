package rebooted;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
/**
 * Handles the game over screen when the player dies.
 * @author danielstratton
 *
 */
public class GameOver extends BasicGameState{
	/**
	 * Declares specific images for the screen
	 */
	private Image background, title,menu;
	/**
	 * Blank constructor for the state.
	 * @param state
	 */
	public GameOver(int state){
	}
	/**
	 * Instantiates the images
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @throws SlickException
	 */
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		background = new Image("res/gameoverbackground.png");
		title = new Image("res/gameover.png");
		menu = new Image("res/menu.png");
	}
	/**
	 * Renders the images to the screen.
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @param Graphics arg2
	 * @throws SlickException
	 */
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		arg2.drawImage(background,0,0);
		arg2.drawImage(title,300,300);
		arg2.drawImage(menu,200,500);
	}
	/**
	 * If the key m is pressed it will take you back to the main menu.
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @param int arg2
	 * @throws SlickException
	 */
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		Input in = arg0.getInput();
		if(in.isKeyDown(Input.KEY_M)){
			arg1.enterState(0);
		}
		
	}
	/**
	 * Returns the id of the state
	 */
	public int getID() {
		return 4;
	}

}
