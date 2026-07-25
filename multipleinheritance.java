class fruits{
    void display(){
        System.out.println("fruits are healthy and has different in taste");
    }
}
class apple extends fruits{
    void display(){
        System.out.println("apples are sweet");
    }
}
class grape extends fruits{
    void display(){
        System.out.println("grapes are sweet and sour");
    }
}
class mango extends fruits{
    void display(){
        System.out.println("managos are sweet");
    }
}
public class multipleinheritance{
    public static void main(String[] args){
        apple a=new apple();
        grape g=new grape();
        mango m=new mango();
        a.display();
        g.display();
        m.display();
        
    }
}