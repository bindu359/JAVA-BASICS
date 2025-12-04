class   Demo10{
    double  z=10.00;
    int r=100;
}
class   Dumtaka3    extends Demo10{
    int x=20;
}
public class Casting12 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting--------");
        Demo10  d=new Dumtaka3();
        System.out.println(d.z);
        System.out.println(d.r);
        System.out.println("--------Downcasting--------");
        Dumtaka3    d3=(Dumtaka3) d;
        System.out.println(d3.z);
        System.out.println(d3.r);
        System.out.println(d3.x);
    }
}
