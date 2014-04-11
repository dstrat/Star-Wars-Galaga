package rebooted;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;
public class Driver extends StateBasedGame{
	public static final String name = "Star Wars Galaga";
	public static final int menu = 0;
	public static final int play = 1;
	public static final int help = 2;
	public static final int pause = 3;
	public static final int gameover = 4;
	public static final int gamewon = 5;
	public Driver(String name) {
		super(name);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		this.addState(new Help(help));
		this.addState(new Pause(pause));
		this.addState(new GameOver(gameover));
		this.addState(new GameWon(gamewon));
	}
	/**
	 * One of the three necessary methods for a state based game.
	 * Gets each state and adds it to the Game Container.
	 * @param GameContainer gcon Takes the main game container as a parameter.
	 * @throws SlickException Throws an exception if something goes wrong with Slick.
	 */
	public void initStatesList(GameContainer gcon) throws SlickException {
		this.getState(menu).init(gcon, this);
		this.getState(play).init(gcon, this);
		this.getState(pause).init(gcon, this);
		this.enterState(menu);
	}
	/**
	 * Main method for the application. Displays the game container, and starts it.
	 * Surrounded in a try catch, if it catches an exception it prints the run time stack.
	 * @param args Default parameter for the main method.
	 */
	public static void main(String [] args){
		AppGameContainer appgcon;
		try{
			appgcon = new AppGameContainer(new Driver(name));
			appgcon.setDisplayMode(830, 640,false);
			appgcon.start();
		}catch(SlickException e){
			e.printStackTrace();
		}
	}


}
