package fr.parisnanterre.miage.poa.shapes;


public final class Square extends Rectangle
{
    /**
	* Default empty Square constructor
	*/
	public Square() {
		super();
		this.setLength(this.length);
		this.setWidth(this.width);
	}

	/**
	* Sets new value of length
	* @param
	*/
	@Override
	public void setLength(double length)
    {
		this.width = length;
		this.length = length;
	}

	/**
	* Sets new value of width
	* @param
	*/
	@Override
	public void setWidth(double width)
    {
		this.length = width;
		this.width = width;
	}
}
