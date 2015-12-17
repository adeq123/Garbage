package punkt;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * This class model a three dimensional point
 * @author RoguskiA
 *@version 1.0
 */

public class Punkt3D extends Punkt2D {

	private double z; /** z coordinate of the point*/

	/**
	 * This method construct a 2D point
	 * @param x x coordinate of the point
	 * @param y y coordinate of the point
	 * @param z z coordinate of the point
	 */
	public Punkt3D (double x, double y, double z){
		super(x,y);
		this.z = z;
	}
	
	/**
	 * Returns a distance between two points
	 * @param p2 a point to which distance we want to calculate
	 * @return distance between out point and another
	 */
	public double distance (Punkt3D p2){
		
		return sqrt(pow(p2.getX() - this.getX(),2) + pow(p2.getY() - this.getY(),2) + pow(p2.getZ() - this.getZ(),2));
	}
	
	public double getZ (){
		return this.z;
	}
	
	public void setZ (double z){
		this.z = z;
	}
}
