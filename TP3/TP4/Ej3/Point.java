package Ej3;

//Preguntar si esta bien lo de Abs


public class Point  implements Movable{
    private  double x, y;
 
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }
 
    @Override
    public String toString() {
        return "{%.2f, %.2f}".formatted(x, y);
    }

    public double distanceTo(Point p){
        return Math.pow(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2)
        , 1/2);
    }

    @Override
    public void moveNorth(double delta) {
        this.y += Math.abs(delta);
    }

    @Override
    public void moveSouth(double delta) {
        this.y -= Math.abs(delta);
    }
        

    @Override
    public void moveWest(double delta) {
        this.x += Math.abs(delta);
    }

    @Override
    public void moveEast(double delta) {
        this.x += Math.abs(delta);
    }
}
