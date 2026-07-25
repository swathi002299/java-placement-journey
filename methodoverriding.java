class animal{
    void sound(){
        System.out.println("animal makes sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class methodoverriding{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
    }
}