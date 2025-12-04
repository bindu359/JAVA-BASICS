class   Sample{
    void disp(){
        System.out.println("Hiiiiiiiiiiiiii");
    }
}
class Ampules extends Sample {
    void tata(){
        System.out.println("Byeeeeeeee");
    }
}
public class Casting2 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting---------");
        Sample   s1 =new Ampules();
        s1.disp();
        System.out.println("--------Downcasting---------");
        Ampules p1=(Ampules) s1;
        p1.tata();
    }
}
