abstract class vehicle{
    abstract void start();
    void stop(){
        System.out.println("vehicle stops");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("car starts with a key");
    }
}
public class abstractclass{
    public static void main(String[] args){
        car c=new car();
        c.start();
        c.stop();
    }
}