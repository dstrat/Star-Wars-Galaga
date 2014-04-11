package rebooted;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
/**
 * A help menu that holds all of the instructions for the game.
 * @author danielstratton
 *
 */
public class Help extends BasicGameState {
	/**
	 * Declares all the image objects, and music objects.
	 */
	private Image background,w,a,s,d,space,whelp,ahelp,shelp,dhelp,spacehelp;
	/**
	 * sets up the state
	 * @param state
	 */
	public Help(int state){	
	}
	/**
	 * Instantiates all the objects.
	 * @param GameContainer arg0.
	 * @param StateBasedGame arg1.
	 * @throws SlickException
	 */
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		background = new Image("res/helpBackground.png");
		w = new Image("res/WKey.png");
		a = new Image("res/AKey.png");
		s = new Image("res/SKey.png");
		d = new Image("res/DKey.png");
		space = new Image("res/SpaceKey.png");
		whelp = new Image("res/WHelp.png");
		ahelp = new Image("res/AHelp.png");
		shelp = new Image("res/SHelp.png");
		dhelp = new Image("res/DHelp.png");
		spacehelp = new Image("res/SpaceHelp.png");
	}
	/**
	 * Renders all the images to the screen.
	 * @param	GameContainer arg0
	 * @param StateBasedGame arg1
	 * @param Graphics g
	 */
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
		g.drawImage(background,0,0);
		g.drawImage(w,200,150);
		g.drawImage(a,200,250);
		g.drawImage(s,200,350);
		g.drawImage(d,200,450);
		g.drawImage(space,75,550);
		g.drawImage(whelp,275,150);
		g.drawImage(ahelp,275,250);
		g.drawImage(shelp,275,350);
		g.drawImage(dhelp,275,450);
		g.drawImage(spacehelp,275,550);
	}
	/**
	 * Allows users to press the BackSpace key to return to the main menu
	 * Stops the current music playing, and starts the main menu song.
	 * @param GameContainer gcon
	 * @param StateBasedGame sbg
	 * @param int arg2
	 * @throws SlickException
	 */
	public void update(GameContainer gcon, StateBasedGame sbg, int arg2) throws SlickException {
		Input in = gcon.getInput();
		if(in.isKeyPressed(Input.KEY_BACK)){
			sbg.enterState(0);
		}
	}
	/**
	 * returns the id of the state
	 */
	public int getID() {
		return 2;
	}

}
