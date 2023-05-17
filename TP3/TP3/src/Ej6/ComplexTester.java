package Ej6;

public class ComplexTester {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(12d, 5);
        ComplexNumber c2 = new ComplexNumber(10, -4654);
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(new ComplexNumber(12, 5))); // true
        System.out.println(c1.plus(c2)); // 22.00 + 5.00
        
        System.out.println(c1.plus(-3)); // 9.00 + 5.00
        System.out.println(c1.plus((double) -3654)); // 9.00 + 5.00
       
        ComplexNumber c3 = new ComplexNumber(-50);
        
        System.out.println(c3);
    }
        
 }
 