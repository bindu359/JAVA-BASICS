class   Cool{
    void add(){
        System.out.println("Hiiiiiiiiiiiiiiii");
    }
}
class   Goolata extends Cool{
    void dispu(){
        System.out.println("Byeeeeeeeeeeeeeeeeeeeeeee");
    }
}
public class Casting4 {
    public static void main(String[] args) {
        System.out.println("-------Upcasting--------");
        Cool    c1=new Goolata();
        c1.add();
        System.out.println("--------Downcasting----------");
        Goolata g1=(Goolata)c1;
        g1.add();
        g1.dispu();
    }
}
