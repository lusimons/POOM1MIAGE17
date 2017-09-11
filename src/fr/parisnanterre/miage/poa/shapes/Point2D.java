package fr.parisnanterre.miage.poa.shapes;

/**
 * c avec du vert => classe abstraite
 */
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
    
}
