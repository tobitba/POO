package Ej3;

public class MovableTester {

    public static void main(String[] args) {
        Point aPoint = new Point(1,2);
        Ellipse anEllipse = new Ellipse(aPoint,2,3);
        System.out.println(anEllipse);
        anEllipse.moveNorth(3);
        System.out.println(anEllipse);
    }
 
 }
 
 