class   Sample2{
    void co(){
        System.out.println("Coooooooooooooool");
    }
}
class Guleyluu  extends Sample2{
    void disp(){
        System.out.println("HEyyyyyyyyyyyyyyyyyyyyyyyy");
    }
}
public class Casting6 {
    public static void main(String[] args) {
        System.out.println("----------Upcasting----------");
        Sample2 s2=new Guleyluu();
        s2.co();
        System.out.println("========Downcasting========");
        Guleyluu    g2=(Guleyluu) s2;
        g2.co();
        g2.disp();
    }
}
