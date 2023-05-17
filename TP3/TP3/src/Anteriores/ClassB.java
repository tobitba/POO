package Anteriores;
public class ClassB extends ClassA {

    public void method(Integer d) {
        System.out.println("ClassB: " + d + " " + d.getClass());
    }
    public static void main(String[] args) {
        ClassB b = new ClassB();
b.method((Number)3);
    }
 }
 