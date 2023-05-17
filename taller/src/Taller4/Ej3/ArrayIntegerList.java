package Taller4.Ej3;
import Taller4.Ej2.IntegerList;
import java.util.Arrays;
/*Crear la clase ArrayIntegerList que implemente la interfaz anterior utilizando un array.
 */

public class ArrayIntegerList implements IntegerList {
    private Integer[] vector;
    private static final int INICIAL_DIM = 5;
    private int index = 0;
    

    public ArrayIntegerList(){
        vector = new Integer[INICIAL_DIM];
    }


    @Override
    public boolean isEmpty(){
        return index == 0;
    }

    //Metodo que alarga el vector en caso de que index == vector.len
    private void resize(){
        vector = Arrays.copyOf(vector, vector.length + INICIAL_DIM);       
    }

    @Override
    public void add(int n){
        if(index == vector.length){
            resize();
        }
        vector[index++] = n;
    }

    @Override
    //Returns index of n in vectir if found, -1 otherwise
    public int contains(int n){
        for(int i = 0; i < index; i++){
            if(vector[i] == n){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index){
        if(index > this.index || index < 0){
            return false;
        }
        //si estoy aca el index esta OK
        vector[index] = vector[this.index-1];
        this.index--;
        return true;

    }
    
}
