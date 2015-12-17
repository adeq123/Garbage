package punkt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * This class model a two dimensional point
 * @author RoguskiA
 *@version 1.0
 */
public class Punkt2D {

	private double x;/** x coordinate of the point*/
	private double y;/** y coordinate of the point*/
	
	/**
	 * This method construct a 2D point
	 * @param x x coordinate of the point
	 * @param y y coordinate of the point
	 */
	public Punkt2D(double x, double y){
		setX(x);
		setY(y);
	}
	
	/**
	 * Returns a distance between two points
	 * @param p2 a point to which distance we want to calculate
	 * @return distance between out point and another
	 */
	public double distance (Punkt2D p2){
		
		return sqrt(pow(p2.getX() - this.getX(),2) + pow(p2.getY() - this.getY(),2));
	}

	
	public void setX (double x){
		this.x = x;
	}
	
	public void setY (double y){
		this.y = y;
	}
	
	
	public double getX (){
		return this.x;
	}
	
	public double getY (){
		return this.y;
	}
	
}
