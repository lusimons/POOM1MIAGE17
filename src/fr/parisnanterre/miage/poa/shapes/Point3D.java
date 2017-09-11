package fr.parisnanterre.miage.poa.shapes;

public class Point3D extends Point2D
{
    protected double z;


	/**
	* Default empty Point3D constructor
	*/
	public Point3D() {
		this(0.0, 0.0, 0.0);
	}

	/**
	* Default Point3D constructor
	*/
	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

    /**
     * [translate the Point3D with dist_x in the x axe, dist_y in the y axe and dist_z in the z axe]
     * @param double dist_x [move the x point to dist_x in the x axe]
     * @param double dist_y [move the y point to dist_y in the y axe]
     * @param double dist_z [move the z point to dist_z in the z axe]
     */
    public void translate(double dist_x, double dist_y, double dist_z)
    {
        super.setX(super.getX() + dist_x);
        super.setY(super.getY() + dist_y);
        this.z += dist_z;
    }

    /**
     * [Check if the point is at the origin of the plane]
     * @return [boolean: true if at the origin, false otherwise]
     */
    @Override
    public boolean isOrigin()
    {
        if(super.getX()==0.0 && super.getY()==0.0 && this.z==0.0)
        {
            return true;
        }
        return false;
    }

    /**
     * [Calculate the distance between two Point3D]
     * @param  Point3D [Point3D object]
     * @return         [double]
     */
    public double distance(Point3D point)
    {
        double dist = Math.sqrt( Math.pow(super.getX() - point.getX(), 2) + Math.pow(super.getY() - point.getY(), 2) + Math.pow(this.z - point.getZ(), 2) );
        return dist;
    }

	/**
	* Returns value of z
	* @return double
	*/
	public double getZ() {
		return z;
	}

	/**
	* Sets new value of z
	* @param double
	*/
	public void setZ(double z) {
		this.z = z;
	}

	/**
	* Create string representation of Point3D for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Point3D [x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + "]";
	}
}
