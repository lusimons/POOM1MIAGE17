package fr.parisnanterre.miage.poa.shapes;


public class Point2D extends Parent implements Interface
{
    private double x;
    private double y;

    /**
    * Default Point2D constructor
    */
    public Point2D(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * [translate the Point2D with dist_x in abscissa and dist_y in ordinate]
     * @param double dist_x [move the x point to dist_x in the abscissa]
     * @param double dist_y [move the y point to dist_x in the ordinate]
     */
    public void translate(double dist_x, double dist_y)
    {
        this.x += dist_x;
        this.y += dist_y;
    }

    /**
     * [Check if the point is at the origin of the plane]
     * @return [boolean: true if at the Origin, false otherwise]
     */
    public boolean isOrigin()
    {
        if (this.x==0 && this.y==0)
        {
            return true;
        }
        return false;
    }

    /**
     * [Calculate the distance between two Point2D]
     * @param  Point2D point         [Point2D object]
     * @return         [double]
     */
    public double distance(Point2D point)
    {
        dist = sqrt( pow(this.x - point.x, 2) + pow(this.y - point.y, 2) );
        return dist;
    }

	/**
	* Returns value of x
	* @return
	*/
	public double getX() {
		return x;
	}

	/**
	* Sets new value of x
	* @param double
	*/
	public void setX(double x) {
		this.x = x;
	}

	/**
	* Returns value of y
	* @return
	*/
	public double getY() {
		return y;
	}

	/**
	* Sets new value of y
	* @param double
	*/
	public void setY(double y) {
		this.y = y;
	}

	/**
	* Create string representation of Point2D for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
}
