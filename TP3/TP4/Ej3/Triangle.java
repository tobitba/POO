package Ej3;

public class Triangle extends Figure {
    private Point firstPoint, secondPoint, thirdPoint;


    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double perimeter(){
        double firstSide = firstPoint.distanceTo(secondPoint);
        double secondSide = secondPoint.distanceTo(thirdPoint);
        double thirdSide = thirdPoint.distanceTo(firstPoint);
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double area(){
        double firstSide = firstPoint.distanceTo(secondPoint);
        double secondSide = secondPoint.distanceTo(thirdPoint);
        double thirdSide = thirdPoint.distanceTo(firstPoint);
         /**
        * Como desconocemos la base y la altura del triángulo
        * usamos la fórmula de Heron que utiliza el semiperímetro
        */
       double semiPerimiter = perimeter() / 2;
       return Math.sqrt(semiPerimiter * (semiPerimiter - firstSide)
               * (semiPerimiter - secondSide) * (semiPerimiter - thirdSide));

    }

    
    
    
    @Override
    public String toString(){
        return "Triangulo [%s , %s , %s]".formatted(firstPoint,secondPoint,thirdPoint);
    }

    @Override
    public void moveNorth(double delta) {
        firstPoint.moveNorth(delta);
        secondPoint.moveNorth(delta);
        thirdPoint.moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta) {
        firstPoint.moveSouth(delta);
        secondPoint.moveSouth(delta);
        thirdPoint.moveSouth(delta);
    }

    @Override
    public void moveWest(double delta) {
        firstPoint.moveWest(delta);
        secondPoint.moveWest(delta);
        thirdPoint.moveWest(delta);
    }

    @Override
    public void moveEast(double delta) {
        firstPoint.moveEast(delta);
        secondPoint.moveEast(delta);
        thirdPoint.moveEast(delta);
    }


    
}
