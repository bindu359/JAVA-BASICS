class   Cola13{
    int f=10;
    void disp(){
        System.out.println("Hellooooooooooooo");
    }
}
class   Chungacha  extends Cola13{
    int d=1000;
    }
public class Casting14 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting---------");
        Cola13  c3=new Chungacha();
        c3.disp();
        System.out.println(c3.f);
        System.out.println("-----------Downcasting-----------");
        Chungacha   c1=(Chungacha) c3;
        c1.disp();
        System.out.println(c1.f);
        System.out.println(c1.d);
    }
}
