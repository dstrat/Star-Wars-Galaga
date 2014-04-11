package rebooted;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Polygon;
/**
 * @author danielstratton
 *	Creates the X-Wing image and boundaries.
 */
public class XWing {
	/**
	 * Declares an Image object, float variables, and a boolean
	 */
	private float Xpos,Ypos,changeXpos,changeYpos;
	private Image xwing;
	/**
	 * Constructor instantiates the x and y and the change in y and x and sets the Image.
	 * @param float x
	 * @param float y
	 * @throws SlickException
	 */
	public XWing(float x,float y) throws SlickException{
		this.Xpos = x;
		this.Ypos = y;
		changeXpos = 0.8f;
		changeYpos = 0.8f;
		setXwing(new Image("res/xwing.png"));
	}
	/**
	 * gets the x position of the xwing
	 * @return Xpos
	 */
	public float getXpos() {
		return Xpos;
	}
	/**
	 * sets the x position of the xwing
	 * @param xpos
	 */
	public void setXpos(float xpos) {
		Xpos = xpos;
	}
	/**
	 * gets the y position of the xwing
	 * @return Ypos
	 */
	public float getYpos() {
		return Ypos;
	}
	/**
	 * sets the y position of the xwing
	 * @param ypos
	 */
	public void setYpos(float ypos) {
		Ypos = ypos;
	}
	/**
	 * gets the xwing image
	 * @return xwing
	 */
	public Image getXwing() {
		return xwing;
	}
	/**
	 * sets the xwing image
	 * @param xwing
	 */
	public void setXwing(Image xwing) {
		this.xwing = xwing;
	}
	/**
	 * Builds the polygon around the x wing
	 * @return xwingBounds
	 */
	public Polygon XWingBounds(){
		Polygon xwingBounds = new Polygon();
		xwingBounds.addPoint(Xpos + 38,Ypos + 96);
		xwingBounds.addPoint(Xpos + 42,Ypos + 96);
		xwingBounds.addPoint(Xpos + 42,Ypos + 86);
		xwingBounds.addPoint(Xpos + 59,Ypos + 86);
		xwingBounds.addPoint(Xpos + 59,Ypos + 96);
		xwingBounds.addPoint(Xpos + 64,Ypos + 96);
		xwingBounds.addPoint(Xpos + 64,Ypos + 83);
		xwingBounds.addPoint(Xpos + 88,Ypos + 78);
		xwingBounds.addPoint(Xpos + 88,Ypos + 80);
		xwingBounds.addPoint(Xpos + 92,Ypos + 80);
		xwingBounds.addPoint(Xpos + 93,Ypos + 60);
		xwingBounds.addPoint(Xpos + 92,Ypos + 33);
		xwingBounds.addPoint(Xpos + 90,Ypos + 31);
		xwingBounds.addPoint(Xpos + 88,Ypos + 33);
		xwingBounds.addPoint(Xpos + 87,Ypos + 60);
		xwingBounds.addPoint(Xpos + 87,Ypos + 64);
		xwingBounds.addPoint(Xpos + 67,Ypos + 64);
		xwingBounds.addPoint(Xpos + 66,Ypos + 62);
		xwingBounds.addPoint(Xpos + 59,Ypos + 61);
		xwingBounds.addPoint(Xpos + 54,Ypos + 2);
		xwingBounds.addPoint(Xpos + 48,Ypos + 2);
		xwingBounds.addPoint(Xpos + 44,Ypos + 59);
		xwingBounds.addPoint(Xpos + 36,Ypos + 61);
		xwingBounds.addPoint(Xpos + 33,Ypos + 64);
		xwingBounds.addPoint(Xpos + 15,Ypos + 64);
		xwingBounds.addPoint(Xpos + 14,Ypos + 33);
		xwingBounds.addPoint(Xpos + 12,Ypos + 28);
		xwingBounds.addPoint(Xpos + 10,Ypos + 24);
		xwingBounds.addPoint(Xpos + 10,Ypos + 34);
		xwingBounds.addPoint(Xpos + 10,Ypos + 71);
		xwingBounds.addPoint(Xpos + 14,Ypos + 81);
		xwingBounds.addPoint(Xpos + 14,Ypos + 78);
		xwingBounds.addPoint(Xpos + 19,Ypos + 79);
		xwingBounds.addPoint(Xpos + 37,Ypos + 83);
		return xwingBounds;
	}
	/**
	 * moves the xwing right
	 */
	public void moveXWingRight(){
		Xpos += changeXpos;
	}
	/**
	 * moves the xwing left
	 */
	public void moveXWingLeft(){
		Xpos -= changeXpos;
	}
	/**
	 * moves the xwing up
	 */
	public void moveXWingUp(){
		Ypos -= changeYpos;
	}
	/**
	 * moves the xwing down
	 */
	public void moveXWingDown(){
		Ypos += changeYpos;
	}
	
}
