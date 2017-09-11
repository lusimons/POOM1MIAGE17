package fr.parisnanterre.miage.poa.shapes;


public abstract class Shape2D extends Shape implements Translatable2D
{
    public Point2D refPoint;

    /**
	* Default empty Shape2D constructor
	*/
	public Shape2D() {
		this(new Point2D(0.0,0.0));
	}

	/**
	* Default Shape2D constructor
	*/
	public Shape2D(Point2D refPoint) {
		super();
		this.refPoint = refPoint;
	}

    /**
     * [abstract method]
     * @return [double]
     */
    public abstract double perimeter();

	/**
	* Sets new value of refPoint
	* @param Point2D
	*/
	public void setRefPoint(Point2D refPoint) {
		this.refPoint = refPoint;
	}
}
