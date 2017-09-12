package fr.parisnanterre.miage.poa.shapes;

import java.lang.Math;


public class Cuboid extends Shape3D
{
    public double length;
    public double height;
    public double width;

	/**
	* Default empty Cone constructor
	*/
	public Cuboid()
    {
		this(0.0, 0.0, 0.0);
	}

	/**
	* Default Cone constructor
	*/
	public Cuboid(double length, double height, double width)
    {
		super();
        this.setLength(length);
		this.setHeight(height);
		this.setWidth(width);
	}

    /**
     * [Calculate the volume of the instance]
     * @return [double]
     */
    @Override
    public double volume()
    {
        double v = Math.pow(this.length, 3);
        return v;
    }

    /**
     * [Calculate the surface of the instance]
     * @return [double]
     */
    @Override
    public double surface()
    {
        double s = Math.pow(this.length, 2) * 6;
        return s;
    }

	/**
	* Returns value of length
	* @return
	*/
	public double getLength() {
		return this.length;
	}

	/**
	* Sets new value of length
	* @param
	*/
	public void setLength(double length) {
		this.length = length;
        this.height = length;
        this.width = length;
	}

	/**
	* Returns value of height
	* @return
	*/
	public double getHeight() {
		return this.height;
	}

	/**
	* Sets new value of height
	* @param
	*/
	public void setHeight(double height) {
		this.height = height;
        this.length = height;
        this.width = height;
	}

	/**
	* Returns value of width
	* @return
	*/
	public double getWidth() {
		return this.width;
	}

	/**
	* Sets new value of width
	* @param
	*/
	public void setWidth(double width) {
		this.width = width;
        this.length = width;
        this.height = width;
	}

    /**
    * Create string representation of Cone for printing
    * @return
    */
    @Override
    public String toString()
    {
        return "Cone [length=" + this.length + "height=" + this.height + ", width=" + this.width + "]";
    }

}
