package Ej8;
import java.util.Arrays;


public class Promotion {
    private String[] numbers;
    private final int MAX_NUMERS;
    private int totalNumbers = 0;
    private double cost;

    public Promotion(int max, double cost){
        MAX_NUMERS = max;
        numbers = new String[MAX_NUMERS];
        changeCost(cost);
    }

    public void changeCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }

    public boolean addNumber(String number){
        if(totalNumbers == MAX_NUMERS){
            return false; // si no tengo lugar, devuelvo que no pude agregar mas nombres
        }
        numbers[totalNumbers++] = number;
        return true;
    }

    public void removeNumber(String number){
        //algo para eliminar 
    }
    
}
