package stream.demo;

public class NotAuthenticatedException extends Exception {
    public NotAuthenticatedException(){
        super("Could not authenticate!");
    }

}
