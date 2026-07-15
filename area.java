public class area{
    void area(int l,int b){
        int area=l*b;
        System.out.println("area of rectangle is "+area);
    }
    void area(int a){
        int area =a*a;
        System.out.println("area of square is"+area);
    }
    void area(double  r){
        double area=3.14*r*r;
        System.out.println("area of circle is "+area);
    }
    public static void main(String[] args){
        area a=new area();
        a.area(5,3);
        a.area(2);
        a.area(7,6);
        a.area(4);
        

    }
}
