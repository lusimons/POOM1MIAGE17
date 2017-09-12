package fr.parisnanterre.miage.poa.shapes;


public class Rectangle extends Shape2D
{
    public double length;
    public double width;

	/**
	* Default empty Rectangle constructor
	*/
	public Rectangle()
    {
		this(0.0, 0.0);
	}

	/**
	* Default Rectangle constructor
	*/
	public Rectangle(double length, double width)
    {
		super();
		this.length = length;
		this.width = width;
	}

    /**
     * [Calculate the perimeter of the instance]
     * @return [double]
     */
    public double perimeter()
    {
        double perimeter = (this.length + this.width)*2;
        return perimeter;
    }

    /**
     * [Calculate the surface of the instance]
     * @return [double]
     */
    public double surface()
    {
        double surface = (this.length * this.width);
        return surface;
    }

	/**
	* Returns value of length
	* @return
	*/
	public double getLength()
    {
		return this.length;
	}

	/**
	* Sets new value of length
	* @param
	*/
	public void setLength(double length)
    {
		this.length = length;
	}

	/**
	* Returns value of width
	* @return
	*/
	public double getWidth()
    {
		return this.width;
	}

	/**
	* Sets new value of width
	* @param
	*/
	public void setWidth(double width)
    {
		this.width = width;
	}

	/**
	* Create string representation of Rectangle for printing
	* @return
	*/
	@Override
	public String toString()
    {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
