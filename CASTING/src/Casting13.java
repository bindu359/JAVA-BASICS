class   Sample21{
    void co(){
        System.out.println("Hiiiiiiiiiiiiii");
    }
}
class   Hahoha  extends Sample21{
    void disp(){
        System.out.println("Byeeeeeeeeeeeeeeee");
    }
}
public class Casting13 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting--------");
        Sample21    s1=new Hahoha();
        s1.co();
        System.out.println("--------Downcasting---------");
        Hahoha  h1=(Hahoha)s1;
        h1.co();
        h1.disp();
    }
}
