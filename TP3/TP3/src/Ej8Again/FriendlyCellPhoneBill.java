package Ej8Again;


public class FriendlyCellPhoneBill extends CellPhoneBill{
    
    private String[] amigos;
    private double discount;
    private final int MAX_AMIGOS;
    private int index;
    private final int BASE_DISCOUNT = 0;

    public FriendlyCellPhoneBill(String number, int MAX){
        super(number);
        MAX_AMIGOS = MAX;
        amigos = new String[MAX_AMIGOS];
        changeDiscount(BASE_DISCOUNT);
        index = 0;
    }

    public void add(String name){
      /*  if(index == MAX_AMIGOS){
            return false;
        }
        amigos[index++] = name;
        return true;*/
        if(index < MAX_AMIGOS && contains(name) != -1) {
            amigos[index++] = name;
        }
 
    }

    public void changeDiscount(double discount){
        this.discount = discount;
    }

    public boolean remove(String name){
        int nameIndex = contains(name);
        if(nameIndex == -1){
            return false;
        }
        amigos[nameIndex] = amigos[--index]; 
        return true;
    }

    private int contains(String name){
        for (int i = 0; i < index; i++){ 
            if(amigos[i].compareTo(name) == 0){return i;}
        }
        return -1;
    }
    @Override   
    public double processBill(){
        double total = 0;
        for(int i = 0; i < callsIndex; i++){
            if(contains(calls[i].getTo()) != -1){
                total += calls[i].getCost() * discount;
            }
            else{
                total += calls[i].getCost();
            }
        }
        return total;
    }
    
}
