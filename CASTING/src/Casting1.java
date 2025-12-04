class   Demo{
    int x=10;
}
class   PemoCha extends Demo{
    void ho(){
        System.out.println("Heyy this is ho.....");
    }
}
public class Casting1 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting---------");
        Demo   d1 =new PemoCha();
        System.out.println(d1.x);
        System.out.println("--------Downcasting---------");
        PemoCha p1=(PemoCha) d1;
        p1.ho();
        System.out.println(p1.x);
    }
}
