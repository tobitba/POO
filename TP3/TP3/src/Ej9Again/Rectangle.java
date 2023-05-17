package Ej9Again;

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
}
