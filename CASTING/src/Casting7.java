class   Cola1{
    int f=10;
}
class Chungacha1 extends Cola1{
    int d=25;
}
public class Casting7 {
    public static void main(String[] args) {
        System.out.println("---------Upcasting---------");
        Cola1   c1=new Chungacha1();
        System.out.println(c1.f);
        System.out.println("---------Downcasting---------");
        Chungacha1  c2 =(Chungacha1)c1;
        System.out.println(c2.f);
        System.out.println(c2.d);
    }
}
