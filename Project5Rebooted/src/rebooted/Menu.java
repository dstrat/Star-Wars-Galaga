package rebooted;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;
/**
 * Menu class is the first state the user sees when opening the program.
 * @author danielstratton
 *
 */
public class Menu extends BasicGameState {
	/**
	 * Declares seven Image variables for the main screen.
	 * Declares three music variables.
	 */
	private Image background;
	private Image play,quit,help,title,enter,h;
	/**
	 * Empty constructor.
	 * @param state Takes the ID state number so it can access the proper state.
	 */
	public Menu(int state){
		
	}
	/**
	 * Standard init method for Basic Game State. Instantiates all the global variables.
	 * Plays and Stops the music.
	 * @param GameContainer gcon, takes the game container class as a parameter.
	 * @param StateBasedGame sbg, StateBasedGame class as a parameter.
	 * @throws SlickExcpetion, A generic exception thrown by every library.
	 */
	public void init(GameContainer gcon,StateBasedGame sbg) throws SlickException{
		background = new Image("res/menuStarbackground.png");
		title = new Image("res/title.png");
		play = new Image("res/play.png");
		help = new Image("res/help.png");
		quit = new Image("res/quit.png");
		h = new Image("res/HKey.png");
		enter = new Image("res/EnterKey.png");
	}
	/**
	 * Renders all the images to specific coordinates on the screen
	 * @param GameContainer gcon, take the game container class as a parameter 
	 * @param StateBasedGame sbg, takes the state based game class as a parameter
	 * @param Graphics g, take the graphics class as a parameter
	 * @throws SlickException, a generic exception thrown by every library
	 */
	public void render(GameContainer gcon,StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawImage(background,0,0);
		g.drawImage(play,300,425);
		g.drawImage(help,310,500);
		g.drawImage(quit,315,560);
		g.drawImage(title,100,60);
		g.drawImage(h,550,575);
		g.drawImage(enter,550,525);
	}
	/**
	 * Implemented method through slick to update the game.
	 * Handles input from the user to switch states.
	 * @param GameContainer gcon, takes the game container class as a parameter.
	 * @param StateBasedGame sbg, takes the state based game class as a parameter.
	 * @param int delta, delta gives a sharper look for frame rates. 
	 * @throws SlickException, a generic expression thrown by every library
	 */
	public void update(GameContainer gcon,StateBasedGame sbg, int delta) throws SlickException{
		Input in = gcon.getInput();
		if(in.isKeyDown(Input.KEY_ENTER)){	
			sbg.enterState(1);
		}
		if(in.isKeyDown(Input.KEY_H)){
			sbg.enterState(2);
		}
	}
	/**
	 * returns the ID of the state.
	 */
	public int getID(){
		return 0;
	}
}