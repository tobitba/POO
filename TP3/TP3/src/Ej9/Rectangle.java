package Ej9;

public class Rectangle extends Figure{
    Point topLeft;
    Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double area(){
        return base()*height();
    }

    @Override
    public double perimeter(){
        return 2*height() + 2*base();
    }

     public double base(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    } 

    public double height(){
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    @Override
    public String toString(){
        return "Rectangulo [ %s , %s ]".formatted(topLeft,bottomRight);
    }
}