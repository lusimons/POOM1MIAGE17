package fr.parisnanterre.miage.poa.shapes;

import java.lang.Math;


public final class Cone extends Shape3D
{
    public double height;
    public double radius;

	/**
	* Default empty Cone constructor
	*/
	public Cone()
    {
		this(0.0, 0.0);
	}

	/**
	* Default Cone constructor
	*/
	public Cone(double height, double radius)
    {
		super();
		this.height = height;
		this.radius = radius;
	}

    /**
     * [Calculate the volume of the instance]
     * @return [double]
     */
    @Override
    public double volume()
    {
        double v = (Math.PI * Math.pow(this.radius, 2) * this.height) / 3;
        return v;
    }

    /**
     * [Calculate the surface of the instance]
     * @return [double]
     */
    @Override
    public double surface()
    {
        double s = Math.sqrt( Math.pow(this.height,2) + Math.pow(this.radius,2) ) * Math.PI * this.radius;
        return s;
    }

	/**
	* Returns value of height
	* @return double
	*/
	public double getHeight()
    {
		return this.height;
	}

	/**
	* Sets new value of height
	* @param double
	*/
	public void setHeight(double height)
    {
		this.height = height;
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
		return "Cone [height=" + height + ", radius=" + radius + "]";
	}
}
