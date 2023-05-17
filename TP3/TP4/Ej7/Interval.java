package Ej7;

public class Interval {
    private final double start;
    private final double end;
    private final double increment;
    private double[] interval;
    private static final int INICIAL_DIM = 5;

    private void generateInterval(){

    }
    
    
    public Interval(double start, double end, double increment) {
        this.start = start;
        this.end = end;
        this.increment = increment;
        interval = new double[INICIAL_DIM];
        generateInterval();
    }

    public Interval(double start, double end) {
        Interval(start,end,1.0);
    }

    public static void main(String[] args) {
        Interval hola = new Interval(1,2);
    }
    
}
