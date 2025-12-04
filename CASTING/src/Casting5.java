class   Demo1{
    double  z=10;
}
class   Dumtaka extends Demo1{
    int x=20;
}
public class Casting5 {
    public static void main(String[] args) {
        Demo1   d1=new Dumtaka();
        System.out.println("---------Upcasting---------");
        System.out.println(d1.z);
        System.out.println("---------Downcasting---------");
        Dumtaka d2=(Dumtaka) d1;
        System.out.println(d2.x);
        System.out.println(d2.z);
    }
}
