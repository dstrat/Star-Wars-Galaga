package rebooted;
import org.newdawn.slick.geom.Rectangle;
/**
 * Makes four rectangles to handle collision detection on the edges of the frame.
 * @author danielstratton
 *
 */
public class Map {
	/**
	 * Declares all the x y width height variables needed for collision detection for the map.
	 */
	private float x1,y1,w1,h1,x2,y2,w2,h2,x3,y3,w3,h3,x4,y4,w4,h4;
	/**
	 * Instantiates all the variables.
	 */
	public Map(){
		x1 = 0;
		y1 = 0;
		w1 = 830;
		h1 = 2;
		
		x2 = 0;
		y2 = 639;
		w2 = 830;
		h2 = 2;
		
		x3 = 829;
		y3 = 0;
		w3 = 2;
		h3 = 640;
		
		x4 = 0;
		y4 = 0;
		w4 = 2;
		h4 = 640;
	}
	/**
	 * sets the top rectangle
	 * @return collUp
	 */
	public Rectangle setTopRect(){
		// x, y, width,height 
		Rectangle collUp = new Rectangle(x1, y1, w1, h1);
		return collUp;
	}
	/**
	 * sets the bottom rectangle
	 * @return collDown
	 */
	public Rectangle setBottomRect(){
		Rectangle collDown = new Rectangle(x2,y2,w2,h2);
		return collDown;
	}
	/**
	 * sets the right rectangle
	 * @return collRight
	 */
	public Rectangle setRightRect(){
		Rectangle collRight = new Rectangle(x3,y3,w3,h3);
		return collRight;
	}
	/**
	 * sets the left rectangle
	 * @return collLeft
	 */
	public Rectangle setLeftRect(){
		Rectangle collLeft = new Rectangle(x4,y4,w4,h4);
		return collLeft;
	}
	/**
	 * gets the second x value.
	 * @return x2
	 */
	public float getX2() {
		return x2;
	}
	/**
	 * sets the second x value
	 * @param x2
	 */
	public void setX2(float x2) {
		this.x2 = x2;
	}
	/**
	 * gets the second y value.
	 * @return y2
	 */
	public float getY2() {
		return y2;
	}
	/**
	 * sets the second y value.
	 * @param y2
	 */
	public void setY2(float y2) {
		this.y2 = y2;
	}
	/**
	 * gets the second width value.
	 * @return w2
	 */
	public float getW2() {
		return w2;
	}
	/**
	 * sets the second width value
	 * @param w2
	 */
	public void setW2(float w2) {
		this.w2 = w2;
	}
	/**
	 * gets the second height value.
	 * @return h2
	 */
	public float getH2() {
		return h2;
	}
	/**
	 * sets the second height value.
	 * @param h2
	 */
	public void setH2(float h2) {
		this.h2 = h2;
	}
	/**
	 * gets the third x value.
	 * @return x3
	 */
	public float getX3() {
		return x3;
	}
	/**
	 * sets the third x value
	 * @param x3
	 */
	public void setX3(float x3) {
		this.x3 = x3;
	}
	/**
	 * gets the third y value.
	 * @return y3
	 */
	public float getY3() {
		return y3;
	}
	/**
	 * sets the third y value.
	 * @param y3
	 */
	public void setY3(float y3) {
		this.y3 = y3;
	}
	/**
	 * gets the third width value.
	 * @return w3
	 */
	public float getW3() {
		return w3;
	}
	/**
	 * sets the third width value
	 * @param w3
	 */
	public void setW3(float w3) {
		this.w3 = w3;
	}
	/**
	 * gets the third height value.
	 * @return h3
	 */
	public float getH3() {
		return h3;
	}
	/**
	 * sets the third height value.
	 * @param h3
	 */
	public void setH3(float h3) {
		this.h3 = h3;
	}
	/**
	 * gets the fourth x value.
	 * @return x4
	 */
	public float getX4() {
		return x4;
	}
	/**
	 * sets the fourth x value
	 * @param x4
	 */
	public void setX4(float x4) {
		this.x4 = x4;
	}
	/**
	 * gets the fourth y value.
	 * @return y4
	 */
	public float getY4() {
		return y4;
	}
	/**
	 * sets the fourth y value.
	 * @param y4
	 */
	public void setY4(float y4) {
		this.y4 = y4;
	}
	/**
	 * gets the fourth width value.
	 * @return w4
	 */
	public float getW4() {
		return w4;
	}
	/**
	 * sets the fourth width value
	 * @param w4
	 */
	public void setW4(float w4) {
		this.w4 = w4;
	}
	/**
	 * gets the fourth height value.
	 * @return h4
	 */
	public float getH4() {
		return h4;
	}
	/**
	 * sets the fourth height value.
	 * @param h4
	 */
	public void setH4(float h4) {
		this.h4 = h4;
	}
	/**
	 * gets the first x value.
	 * @return x1
	 */
	public float getX() {
		return x1;
	}
	/**
	 * sets the first x value
	 * @param x1
	 */
	public void setX(float x) {
		this.x1 = x;
	}
	/**
	 * gets the first y value.
	 * @return y1
	 */
	public float getY() {
		return y1;
	}
	/**
	 * sets the first y value.
	 * @param y1
	 */
	public void setY(float y) {
		this.y1 = y;
	}
	/**
	 * gets the first width value.
	 * @return w1
	 */
	public float getW() {
		return w1;
	}
	/**
	 * sets the first width value
	 * @param w1
	 */
	public void setW(float w) {
		this.w1 = w;
	}
	/**
	 * gets the first height value.
	 * @return h1
	 */
	public float getH() {
		return h1;
	}
	/**
	 * sets the first height value.
	 * @param h1
	 */
	public void setH(float h) {
		this.h1 = h;
	}
}