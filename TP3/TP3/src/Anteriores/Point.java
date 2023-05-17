package Anteriores;
public class Point {
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    @Override
    public String toString() {
        return "{%g, %g}".formatted(x, y);
    }

    @Override
    public boolean equals(Object o){

        return ( o == this || (o instanceof Point p && Double.compare(x, p.getX()) == 0 && Double.compare(y, p.getY()) == 0 ));
    }

    public static void main(String[] args){
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
      //  System.out.println(p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY()));
    }
}
    
