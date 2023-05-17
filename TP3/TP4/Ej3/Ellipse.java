package Ej3;


public class Ellipse extends Figure {
    private Point centerPoint;
    private double sMayorAxis;
    private double sMinorAxis;

    public Ellipse(Point centerPoint, double sMayotAxis, double sMinorAxis) {
        this.centerPoint = centerPoint;
        this.sMayorAxis = sMayotAxis;
        this.sMinorAxis = sMinorAxis;
    }

    @Override
    public double area() {
        return Math.PI / 4 * sMayorAxis * sMinorAxis;
    }
 
    @Override
    public double perimeter() {
        return Math.PI / 2 * (sMayorAxis + sMinorAxis);
    }
 
    @Override
    public String toString() {
        return "Elipse [Centro: %s, DMayor: %.2f, DMenor: %.2f]".formatted(centerPoint, sMayorAxis, sMinorAxis);
    }

    @Override
    public void moveNorth(double delta) {
        centerPoint.moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta) {
        centerPoint.moveSouth(delta);
    }

    @Override
    public void moveWest(double delta) {
        centerPoint.moveWest(delta);
    }

    @Override
    public void moveEast(double delta) {
        centerPoint.moveEast(delta);
    }
 

    
    
    
}
