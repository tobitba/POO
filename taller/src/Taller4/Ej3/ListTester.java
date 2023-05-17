package Taller4.Ej3;
import Taller4.Ej2.*;;

public class ListTester {
 
    public static void main(String[] args) {
        IntegerList integerList = new ArrayIntegerList();
        System.out.println(integerList.isEmpty()); // true
        /*integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        System.out.println(integerList.contains(3)); // 2
        System.out.println(integerList.remove(2)); // true
        System.out.println(integerList.contains(3)); // -1
    */
        integerList.remove(0);
}
 
}