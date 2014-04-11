package rebooted;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
/**
 * Creates a state inside the game state that pauses the game and allows the player to resume or return to the main menu
 * @author danielstratton
 *
 */
public class Pause extends BasicGameState{
	/**
	 * Declares necessary objects for the state
	 */
	Image pausebackground,resume,mainmenu;
	Play p;
	Menu m;
	/**
	 * builds the pause menu
	 * @param state
	 */
	public Pause(int state){
	}
	/**
	 * Init method instantiates all the objects to their respective values.
	 * @throws SlickException
	 */
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException{
		pausebackground = new Image("res/mustafar.png");
		resume = new Image("res/resume.png");
		mainmenu = new Image("res/menu.png");
		p = new Play(1);
		m = new Menu(0);
	}
	/**
	 * Render method draws the images to the screen
	 * @param GameContainer arg0
	 * @param StateBasedGame arg1
	 * @param Graphics g
	 * @throws SlickException
	 */
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException{
		g.drawImage(pausebackground,0,0);
		g.drawImage(resume,150,100);
		g.drawImage(mainmenu,150,250);
	}
	/**
	 * Update method allows the user to either press r to resume, or m to return to the main menu.
	 * Stops the current song playing, and starts a new one.
	 * @param GameContainer gcon
	 * @param StateBasedGame arg1
	 * @param int arg2
	 * @throws SlickException
	 */
	public void update(GameContainer gcon, StateBasedGame arg1, int arg2) throws SlickException{
		Input in = gcon.getInput();
		if(in.isKeyDown(Input.KEY_R)){
			unpauseUpdate();
			unpauseRender();
			arg1.enterState(1);
			
		}
		if(in.isKeyDown(Input.KEY_M)){
			arg1.enterState(0);
		}
	}
	/**
	 * returns the id of this state
	 */
	public int getID(){
		return 3;
	}
	
}
