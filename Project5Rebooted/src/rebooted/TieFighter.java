package rebooted;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Polygon;
/**
 * Essentially the enemy class of the games, creates the image of the Tie Fighter, sets up the polygon
 * Sets the x y width and height of the image. 
 * @author danielstratton
 *
 */
public class TieFighter {
	/**
	 * Declares necessary variables, and objects for the class.
	 */
	private float Xpos,Ypos;
	private Image TF;
	private Polygon tfBounds;
	/**
	 * Constructor instantiates the x and y values.
	 * @throws SlickException 
	 */
	public TieFighter(float x,float y) throws SlickException{
		this.Xpos = x;
		this.Ypos = y;
		setTF(new Image("res/tiefighter.png"));
	}
	/**
	 * gets the initial x position.
	 * @return Xpos
	 */
	public float getXpos() {
		return Xpos;
	}
	/**
	 * sets the initial x position.
	 * @param x
	 */
	public void setXpos(float xpos) {
		Xpos = xpos;
	}
	/**
	 * gets the initial y position.
	 * @return Ypos
	 */
	public float getYpos() {
		return Ypos;
	}
	/**
	 * sets the initial y position.
	 * @param ypos
	 */
	public void setYpos(float ypos) {
		Ypos = ypos;
	}
	/**
	 * Builds a polygon around every TieFighter
	 * @return tfBounds
	 */
	public Polygon getTfBounds() {
		tfBounds = new Polygon();
		tfBounds.addPoint(Xpos + 4,Ypos + 6);
		tfBounds.addPoint(Xpos + 4,Ypos + 45);
		tfBounds.addPoint(Xpos + 1,Ypos + 48);
		tfBounds.addPoint(Xpos + 1,Ypos + 61);
		tfBounds.addPoint(Xpos + 4,Ypos + 64);
		tfBounds.addPoint(Xpos + 4,Ypos + 104);
		tfBounds.addPoint(Xpos + 11,Ypos + 104);
		tfBounds.addPoint(Xpos + 11,Ypos + 68);
		tfBounds.addPoint(Xpos + 11,Ypos + 65);
		tfBounds.addPoint(Xpos + 15,Ypos + 61);
		tfBounds.addPoint(Xpos + 22,Ypos + 59);
		tfBounds.addPoint(Xpos + 37,Ypos + 66);
		tfBounds.addPoint(Xpos + 44,Ypos + 71);
		tfBounds.addPoint(Xpos + 54,Ypos + 70);
		tfBounds.addPoint(Xpos + 63,Ypos + 54);
		tfBounds.addPoint(Xpos + 75,Ypos + 59);
		tfBounds.addPoint(Xpos + 82,Ypos + 61);
		tfBounds.addPoint(Xpos + 83,Ypos + 66);
		tfBounds.addPoint(Xpos + 86,Ypos + 68);
		tfBounds.addPoint(Xpos + 86,Ypos + 104);
		tfBounds.addPoint(Xpos + 92,Ypos + 104);
		tfBounds.addPoint(Xpos + 92,Ypos + 64);
		tfBounds.addPoint(Xpos + 94,Ypos + 61);
		tfBounds.addPoint(Xpos + 95,Ypos + 47);
		tfBounds.addPoint(Xpos + 91,Ypos + 45);
		tfBounds.addPoint(Xpos + 92,Ypos + 5);
		tfBounds.addPoint(Xpos + 84,Ypos + 5);
		tfBounds.addPoint(Xpos + 85,Ypos + 41);
		tfBounds.addPoint(Xpos + 81,Ypos + 49);
		tfBounds.addPoint(Xpos + 70,Ypos + 49);
		tfBounds.addPoint(Xpos + 54,Ypos + 37);
		tfBounds.addPoint(Xpos + 43,Ypos + 36);
		tfBounds.addPoint(Xpos + 31,Ypos + 47);
		tfBounds.addPoint(Xpos + 22,Ypos + 50);
		tfBounds.addPoint(Xpos + 14,Ypos + 48);
		tfBounds.addPoint(Xpos + 14,Ypos + 48);
		tfBounds.addPoint(Xpos + 14,Ypos + 44);
		tfBounds.addPoint(Xpos + 10,Ypos + 41);
		tfBounds.addPoint(Xpos + 10,Ypos + 4);
		return tfBounds;
	}
	/**
	 * gets the TieFighter image
	 * @return
	 */
	public Image getTF() {
		return TF;
	}
	/**
	 * sets the TieFighter image
	 * @param tF
	 */
	public void setTF(Image tF) {
		TF = tF;
	}
	/**
	 * moves the TieFighters down
	 * @return Ypos
	 */
	public float tfMove(){
		Ypos += 0.2;
		return Ypos;
	}
}
