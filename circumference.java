public class circumference{
    void circumference(double r){
        double circum=2*3.14*r;
        System.out.println("circumference of circle is "+circum);
    }
    
    public static void main(String[] args){
        circumference a=new circumference();
        a.circumference(5);
        a.circumference(2);
        a.circumference(7);
        a.circumference(4);
        

    }
}
