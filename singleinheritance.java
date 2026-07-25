class person{
    void display(){
        System.out.println("i am a person");

    }
}
class student extends person{
    void display(){
        System.out.println("i am studing");
    }
}
public class singleinheritance{
    public static void main(String[] args){
        student s=new student();
        s.display();
    }
}