package Pruebas

public class Counter {
    private int count = 0;

    public Counter(){
        
    }

    public int getCount(){
        return this.count;
    }

    public void increment() {
        count++;
    }
    public void decrement(){
        if(count>0){
            count--;
        }
    }
}
