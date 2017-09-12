package fr.parisnanterre.miage.poa.shapes;

import java.lang.Math;


public class Sphere extends Shape3D
{
    public double radius;

	/**
	* Default empty Cone constructor
	*/
	public Sphere()
    {
		this(0.0);
	}

	/**
	* Default Cone constructor
	*/
	public Sphere(double radius)
    {
		super();
		this.radius = radius;
	}

    /**
     * [Calculate the volume of the instance]
     * @return [double]
     */
    @Override
    public double volume()
    {
        double v = (4/3) * Math.PI * Math.pow(this.radius, 3);
        return v;
    }

    /**
     * [Calculate the surface of the instance]
     * @return [double]
     */
    @Override
    public double surface()
    {
        double s = 4 * Math.PI * Math.pow(this.radius, 3);
        return s;
    }

	/**
	* Returns value of radius
	* @return double
	*/
	public double getRadius()
    {
		return this.radius;
	}

	/**
	* Sets new value of radius
	* @param double
	*/
	public void setRadius(double radius)
    {
		this.radius = radius;
	}

	/**
	* Create string representation of Cone for printing
	* @return
	*/
	@Override
	public String toString()
    {
		return "Sphere [radius=" + radius + "]";
	}
}
