package rebooted;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
/**
 * Creates the lasers for the X-Wing to shoot.
 * @author danielstratton
 *
 */
public class Lasers {
	/**
	 * Declares all necessary variables, and objects for the class.
	 */
	private Image leftLaserImage;
	private Image rightLaserImage;
	private Rectangle leftLaserBounds;
	private Rectangle rightLaserBounds;
	private float x,x2;
	private float y,y2;
	private boolean collide;
	/**
	 * Sets the x and y positions of the lasers.
	 * Instantiates objects, and Rectangles
	 * @throws SlickException
	 */
	public Lasers() throws SlickException{
		x = 0;
		x2 = 0;
		y = 0;
		y2 = 0;
		leftLaserImage = new Image("res/greenLaserRay.png");
		rightLaserImage = new Image("res/greenLaserRay.png");
	}
	
	/**
	 * Offsets lasers takes in leftXY and rightXY of XWING
	 * Add or subtract leftXY to xy do the same to rightXY so that lasers are in right position. 
	 */
	public void offsetLasers(float leftX, float leftY, float rightX, float rightY){
		x += leftX;
		y += leftY;
		x2 += rightX;
		y2 += rightY;
	}
	/**
	 * Creates the bounds of the left laser
	 * @return leftLaserBounds.
	 */
	public Rectangle createLeftLaserBounds(){
		leftLaserBounds = new Rectangle(getX(),getY(),30,41);
		return leftLaserBounds;
	}
	public Rectangle createRightLaserBounds(){
		rightLaserBounds = new Rectangle(getX2(),getY2(),30,41);
		return rightLaserBounds;
	}
	/**
	 * moves the left laser up.
	 */
	public void moveLeftLaser(){
		y -= 0.8;
	}
	/**
	 * moves the right laser up
	 */
	public void moveRightLaser(){
		y2 -= 0.8;
	}
	/**
	 * sets the x value
	 * @param x
	 */
	public void setX(float x){
		this.x = x;
	}
	/**
	 * sets the y value
	 * @param y
	 */
	public void setY(float y){
		this.y = y;
	}
	/**
	 * sets the second 2 value
	 * @param x2
	 */
	public void setX2(float x2){
		this.x2 = x2;
	}
	/**
	 * sets the second y value.
	 * @param y2
	 */
	public void setY2(float y2){
		this.y2 = y2;
	}
	/**
	 * gets the first x value
	 * @return x
	 */
	public float getX(){
		return x;
	}
	/**
	 * gets the first y value
	 * @return y
	 */
	public float getY(){
		return y;
	}
	/**
	 * gets the second x value
	 * @return x2
	 */
	public float getX2(){
		return x2;
	}
	/**
	 * gets the second y value
	 * @return y2
	 */
	public float getY2(){
		return y2;
	}
	/**
	 * checks for colllision
	 * @return collide
	 */
	public boolean getCollision(){
		return collide;
	}
	/**
	 * gets the left laser
	 * @return leftLaserImage.
	 */
	public Image getLeftLaser(){
		return leftLaserImage;
	}
	/**
	 * gets the right laser
	 * @return rightLaserImage
	 */
	public Image getRightLaser(){
		return rightLaserImage;
	}
}
