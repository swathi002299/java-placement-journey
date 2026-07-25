public class constructoroverriding{
    String name;
    int age;
    constructoroverriding(){
        name="unknown";
        age=0;
    }
    constructoroverriding (String n){
        name=n;
        age=0;
    }
    constructoroverriding(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println();
    }
    public static void main(String[] args){
        constructoroverriding m1=new constructoroverriding();
        constructoroverriding m2=new constructoroverriding("swathi");
        constructoroverriding m3=new constructoroverriding("swathi",19);
        m1.display();
        m2.display();
        m3.display();
    }
    }
