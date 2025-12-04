class  Cool4{
    void add(){
        System.out.println("Hiiiiiiiiiiiiiiiiiiii");
    }
}
class   Goolata2    extends Cool4{
    void dispu(){
        System.out.println("Helloooooooooooooooooo");
    }
    int r=10;
}
public class Casting11 {
    public static void main(String[] args) {
        Cool4   c4=new Goolata2();
        System.out.println("-------Upcasting--------");
        c4.add();
        System.out.println("-------Downcasting--------");
        Goolata2    g2=(Goolata2)c4;
        g2.add();
        g2.dispu();
        System.out.println(g2.r);
    }
}
