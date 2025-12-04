class   Cool2{
    void disp(){
        System.out.println("Cooooooooooolllllllllllll");
    }
}
class Dinga extends Cool2{
    void tata(){
        System.out.println("Tataaaaaaaaaaaaaaaa");
    }
    int x=70;
}
public class Casting9 {
    public static void main(String[] args) {
        System.out.println("---------Upcasting----------");
        Cool2   c2=new Dinga();
        c2.disp();
        System.out.println("---------Downcasting----------");
        Dinga   d1=(Dinga)c2;
        d1.disp();
        d1.tata();
        System.out.println(d1.x);
    }
}
