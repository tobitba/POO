package Anteriores;
public class ClassA {

    public void method(Number n) {
        System.out.println("ClassA: " + n + " " + n.getClass());
    }

    public static void main(String[] args) {
        ClassA a = new ClassB();
a.method(3);
    }
 
 }
 