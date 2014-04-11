package rebooted;
import java.util.Iterator;
import java.util.LinkedList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState{
	/**
	 * Declares all necessary objects, lists, and variables needed for the game. 
	 */
	private LinkedList<TieFighter> tfList;
	private XWing xw;
	private Map m;
	private int x,y,i;
	private Image background;
	private int highscore;
	private boolean shot, shot2 = false;
	private int totalShips;
	private float xwingX,xwingY;
	private Lasers l;
	/**
	 * Builds the play state
	 * @param state takes the state number.
	 */
	public Play(int state){
	}
	/**
	 * Default init method through Slick.
	 * Instantiates all objects,variables,and lists needed for the class.
	 * @param GameContainer gcon takes the GameContainer as a param
	 * @param StateBasedGame sbg, takes the state of the game as a param
	 * @throws SlickException, a generic expression thrown by every library
	 */
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		background = new Image("res/fightingStage.png");
		highscore = 0;
		tfList = new LinkedList<TieFighter>();
		xwingX = 370;
		xwingY = 500;
		l = new Lasers();
		xw = new XWing(xwingX,xwingY);
		m = new Map();
		x = 30;
		y = -100;
		i = 0;
		totalShips = 5;
		addTieFighters();
	}
	
	/**
	 * Enter method gets called when entering the game.
	 * Acts as a reset method.
	 * @param GameContainer container
	 * @param StateBasedGame game
	 * @throws SlickException
	 */
	public void enter(GameContainer container, StateBasedGame game) throws SlickException {
		super.enter(container, game);
		tfList=null;
		background = new Image("res/fightingStage.png");
		highscore = 0;
		tfList = new LinkedList<TieFighter>();
		xwingX = 370;
		xwingY = 500;
		l = new Lasers();
		xw = new XWing(xwingX,xwingY);
		m = new Map();
		x = 30;
		y = -100;
		i = 0;
		totalShips = 5;
		addTieFighters();
		
	}
	/**
	 * Default render method through Slick to successfully draw all the images and manipulation of images to the screen.
	 * Draws the main ship, an X-Wing, and an enemy ship, a Tie-Fighter.
	 * Allows draws the lasers firing from the X-Wing.
	 * @param GameContainer gcon takes the GameContainer as a param
	 * @param StateBasedGame sbg, takes the state of the game as a param
	 * @param Graphics g, allows you to draw the images.
	 * @throws SlickException, a generic expression thrown by every library
	 */
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(background,0,0);
		g.drawImage(xw.getXwing(),xw.getXpos(),xw.getYpos());
		removeTieFighters(g);
		if(shot){
			l.getLeftLaser().draw(l.getX(),l.getY());
			l.createLeftLaserBounds();
		}
		if(shot2){
			l.getRightLaser().draw(l.getX2(),l.getY2());
			l.createRightLaserBounds();
		}
		Iterator<TieFighter> iter = tfList.iterator();
		while(iter.hasNext()){
			TieFighter tf = iter.next();
			g.drawImage(tf.getTF(),tf.getXpos(),tf.getYpos());
		}
	}
	/**
	 * Updates the entire state of the class.
	 * Allows users to use the WASD keys to move up down left and right.
	 * Allows users to hit the Space key to shoot the lasers.
	 * Allows users to use the P key to pause the game.
	 * @param GameContainer gcon takes the GameContainer as a param.
	 * @param StateBasedGame sbg, takes the state of the game as a param
	 * @param int delta, precise frames per second.
	 * @throws SlickException a generic exception thrown by every library
	 */
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input in = gc.getInput();
		if(in.isKeyDown(Input.KEY_W) && !topSideCollision()){
			xw.moveXWingUp();
			if(!shot){
		    	l.setY((float)(l.getY() - 3.0));
		    }
		    if(!shot2){
		    	l.setY2((float)(l.getY2() - 3.0));
		    }
		    shipToShipCollision(sbg);
		}
		if(in.isKeyDown(Input.KEY_A) && !leftSideCollision()){
			xw.moveXWingLeft();
			if(!shot){
		    	l.setX((float)(l.getX() - 0.8));
			}
		    if(!shot2){
		    	l.setX2((float)(l.getX2() - 0.8));
		   	}
		    shipToShipCollision(sbg);
		}
		if(in.isKeyDown(Input.KEY_S) && !bottomSideCollision()){
			xw.moveXWingDown();
			if(!shot){
		    	l.setY((float)(l.getY() + 0.8));
		    }
		    if(!shot2){
		    	l.setY2((float)(l.getY2() + 0.8));
		    }
		    shipToShipCollision(sbg);
		}
		if(in.isKeyDown(Input.KEY_D) && !rightSideCollision()){
			xw.moveXWingRight();
			if(!shot){
		    	l.setX((float)(l.getX() + 0.8));
		    }
		    if(!shot2){
		    	l.setX2((float)(l.getX2() + 0.8));
		    }
		    shipToShipCollision(sbg);
		}
		if(in.isKeyDown(Input.KEY_SPACE)){
			if(!shot2){
				shot2 = true;
			}
			if(!shot){
				shot = true;
			}
		}
		if(in.isKeyDown(Input.KEY_P)){
			sbg.enterState(3);
		}
		if(shot2){
			if(!rightLaserCollision()){
				l.moveRightLaser();
			}
			else{
				shot2 = false;
				l.setX2(xw.getXpos() + 73);
				l.setY2(xw.getYpos());
			}
			
		}
		if(shot){
			if(!leftLaserCollide()){
				l.moveLeftLaser();
			}
			else{
				shot = false;
				l.setX(xw.getXpos());
				l.setY(xw.getYpos());
			}
		}
		laserToTieFighterCollision(sbg);
	}
	/**
	 * Check to see if the laser collides with the tie fighters. Also counts the high score.
	 * @param StateBasedGame sbg
	 * @throws SlickException
	 */
	public void laserToTieFighterCollision(StateBasedGame sbg) throws SlickException{
		Iterator<TieFighter> iter = tfList.iterator();
		while(iter.hasNext()){
			TieFighter tf = iter.next();
			if(l.createLeftLaserBounds().intersects(tf.getTfBounds())){
				iter.remove();
				System.out.println(highscore);
				highscore++;
			}
			else if(l.createRightLaserBounds().intersects(tf.getTfBounds())){
				iter.remove();
				System.out.println(highscore);
				highscore++;
			}
		}
		if(highscore == 5){
			sbg.enterState(5);
		}
	}
	/**
	 * Checks to see if the left laser hits the frame
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean leftLaserCollide(){
		if(l.getY() < 0){
			return true;
		}
		return false;
	}
	/**
	 * Checks to see if the right laser hits the frame
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean rightLaserCollision(){
		if(l.getY2() < 0){
			return true;
		}
		return false;
	}
	/**
	 * Add enemies to the linked list.
	 * @throws SlickException 
	 */
	public void addTieFighters() throws SlickException{
		i=0;
		x=30;
		y=-100;
		while(i < totalShips){
			TieFighter t = new TieFighter(x,y);
			tfList.add(t);
			x = x + 160;
			i++;
		}
	}
	/**
	 * Remove enemies from the linked list.
	 */
	public void removeTieFighters(Graphics g) throws SlickException{
		Iterator<TieFighter> iter = tfList.iterator();
		while(iter.hasNext()){
			TieFighter tf = iter.next();
			tf.tfMove();
			if(tf.getYpos() >= 600){
				iter.remove();
			}
		}
		if(tfList.size()<=0)
			addTieFighters();
	}
	/**
	 * Checks to see if the ship has reached the end of the frame by hitting the right side.
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean rightSideCollision(){
		if(xw.XWingBounds().intersects(m.setRightRect())){
			return true;
		}
		return false;
	}
	/**
	 * Checks to see if the ship has reached the end of the frame by hitting the left side.
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean leftSideCollision(){
		if(xw.XWingBounds().intersects(m.setLeftRect())){
			return true;
		}
		return false;
	}
	/**
	 * Checks to see if the ship has reached the end of the frame by hitting the top.
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean topSideCollision(){
		if(xw.XWingBounds().intersects(m.setTopRect())){
			return true;
		}
		return false;
	}
	/**
	 * Checks to see if the ship has reached the end of the frame by hitting the bottom.
	 * @return boolean, returns false if it does not hit the wall.
	 */
	public boolean bottomSideCollision(){
		if(xw.XWingBounds().intersects(m.setBottomRect())){
			return true;
		}
		return false;
	}
	/**
	 * Checks if there is a collision between the tie fighter and the xwing.
	 * @return
	 */
	public boolean shipToShipCollision(StateBasedGame sbg){
		Iterator<TieFighter> iter = tfList.iterator();
		while(iter.hasNext()){
			TieFighter tf = iter.next();
			if(tf.getTfBounds().intersects(xw.XWingBounds())){
				iter.remove();
				sbg.enterState(4);
				return true;
			}
		}
		return false;
	}
	/**
	 * Returns the state id of the game.
	 */
	public int getID() {
		
		return 1;
	}

}
