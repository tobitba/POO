package Ej3;

public class Rectangle extends Figure {
    private Point topLeft,bottomRight;

    public Rectangle(Point tL, Point bR){
        topLeft = tL;
        bottomRight = bR;
    }

    public double base(){return Math.abs(topLeft.getX() - bottomRight.getX()) ;}

    public double height(){return Math.abs(topLeft.getY() - bottomRight.getY());}

    public double area(){
        return base()*height();
    }

    public double perimeter(){
        return 2*base() +2*height();
    }

    @Override
    public String toString(){
        return "Rectangulo [%s , %s]".formatted(topLeft,bottomRight);

    }

    @Override
    public void moveNorth(double delta) {
        topLeft.moveNorth(delta);
        bottomRight.moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta) {
        topLeft.moveSouth(delta);
        bottomRight.moveSouth(delta);
    }

    @Override
    public void moveWest(double delta) {
        topLeft.moveWest(delta);
        bottomRight.moveWest(delta);
    }

    @Override
    public void moveEast(double delta) {
        topLeft.moveEast(delta);
        bottomRight.moveEast(delta);
    }
}
