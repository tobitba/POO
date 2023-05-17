package Taller4;

public class CannotRideException extends Exception{
    private static final String MENSAJE = "ERROR: No puede realizar el viaje";

    public CannotRideException(){
        super(MENSAJE);
    }

    public CannotRideException(String str){
        super(str);
    }

}
