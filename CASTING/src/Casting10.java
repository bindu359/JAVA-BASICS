class   Tester3{
    int r=10;
    void disp(){
        System.out.println("Hiiiiiiiiiiiiiiiiii");
    }
}
class Tista1  extends Tester3 {
    void uliya(){
        System.out.println("Uliyaaaaaaaaaaaaaaa");
    }
}
public class Casting10 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting--------");
        Tester3 t3=new Tista1();
        t3.disp();
        System.out.println(t3.r);
        System.out.println("---------Downcasting---------");
        Tista1  t1=(Tista1)t3;
        t1.disp();
        System.out.println(t1.r);
        t1.uliya();
    }
}
