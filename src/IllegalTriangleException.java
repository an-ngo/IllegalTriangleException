public class IllegalTriangleException extends Exception{
    String messenger;

    public IllegalTriangleException(String messenger) {
        //super(messenger);
        this.messenger = messenger;
    }

    @Override
    public String getMessage(){
        return messenger;
    }
}
