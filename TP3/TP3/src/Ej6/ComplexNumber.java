package Ej6;
/*Se desea modelar a un número complejo (parte real y parte imaginaria). 
La clase ComplexNumber debe permitir:
    -Instanciar un objeto a partir de su parte real y su parte imaginaria
    -Instanciar un objeto a partir de su parte real (asumiendo cero como parte imaginaria)
    -Consultar su parte real y su parte imaginaria
    -Que una instancia de ComplexNumber pueda sumarse con otra instancia de ComplexNumber, 
     obteniendo así una nueva instancia con el resultado de la operación.  */
public class ComplexNumber {
    private final double re, im;

   

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public ComplexNumber(Number re) {
        this(re.doubleValue(),0);
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }
    
    public ComplexNumber plus(ComplexNumber z){
        return new ComplexNumber(this.re + z.re,this.im + z.im);
    }

    public ComplexNumber plus(Number n){
        return new ComplexNumber(this.re + n.doubleValue(),this.im );
    }

    @Override
    public boolean equals(Object o){
        return (this == o || 
             (o instanceof ComplexNumber z &&
               Double.compare(this.re, z.getRe())==0 &&
               Double.compare(this.im, z.getIm())==0) );
    }
   
    @Override
    public String toString(){
        return "%s  %si".formatted(this.re, this.im);
    }
    
}