package fr.parisnanterre.miage.poa.shapes;


public abstract class Shape3D extends Shape implements Translatable3D
{
    public Point3D refPoint;

	/**
	* Default empty Shape3D constructor
	*/
	public Shape3D() {
		this(new Point3D(0.0, 0.0, 0.0));
	}

	/**
	* Default Shape3D constructor
	*/
	public Shape3D(Point3D refPoint) {
		super();
		this.refPoint = refPoint;
	}

    /**
     * [abstract method]
     * @return [double]
     */
    public abstract double volume();

	/**
	* Returns value of refpoint
	* @return Point3D
	*/
	public Point3D getRefPoint() {
		return this.refPoint;
	}

	/**
	* Sets new value of refpoint
	* @param Point3D
	*/
	public void setRefpoint(Point3D refPoint) {
		this.refPoint = refPoint;
	}
}
