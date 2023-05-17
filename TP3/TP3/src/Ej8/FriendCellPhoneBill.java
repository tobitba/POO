package Ej8;

import java.lang.reflect.Array;

public class FriendCellPhoneBill extends CellPhoneBill {
    private String[] friends;
    private int friendsIndex = 0;
    private final int friendsLimit;
    private double cost;
    private final int DEFAULT_FRIEND_COST_PER_SECOND = 0;

    public FriendCellPhoneBill(String number, int friendsLimit){
        super(number);
        this.friendsLimit = friendsLimit;
        friends = new String[friendsLimit];
    }

  
    public void setCost(double cost) {
        this.cost = cost;
    }

    private boolean containsFriend(String number){
        return number == "";
    }

    public void addFriend(String number){
        if(friendsIndex < friendsLimit && !containsFriend(number)){
            friends[friendsIndex++] = number;
        }
    }

    public void removeFriend(String number){
        friends[friendsIndex].compareTo(number);
    }


    

}
