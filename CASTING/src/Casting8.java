class   Tester1{
    int x=10;
    void disp(){
        System.out.println("Tester  classssssssssss");
    }
}
class   Huliyacha   extends Tester1{
    void ho(){
        System.out.println("Enthadaaaaaaaaaaaaaaa");
    }
}
public class Casting8 {
    public static void main(String[] args) {
        System.out.println("----------Upcasting-----------");
        Tester1 t1=new Huliyacha();
        System.out.println(t1.x);
        t1.disp();
        System.out.println("----------Downcasting-----------");
        Huliyacha   h1=(Huliyacha) t1;
        h1.ho();
        h1.disp();
        System.out.println(h1.x);
    }
}
