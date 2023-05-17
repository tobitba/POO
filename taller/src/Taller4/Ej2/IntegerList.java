package Taller4.Ej2;

/*Debe permitir agregar un elemento, 
obtener la posición de un elemento si es que existe, 
remover un elemento de cierta posición y saber si la lista está vacía. */

public interface IntegerList {
    boolean isEmpty();
    void add(int element);
    int contains(int element);
    boolean remove(int index);

}
