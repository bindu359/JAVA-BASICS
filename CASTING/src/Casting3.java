class   Tester{
    int r=10;
}
class Tista extends Tester{
    void uliya(){
        System.out.println("Uliyaaaaaaaaaaaaaaaa");
    }
}
public class Casting3 {
    public static void main(String[] args) {
        System.out.println("--------Upcasting-------------");
      Tester  t1=new Tista();
       System.out.println(t1.r);
        System.out.println("--------Downcasting-------------");
        Tista   t=(Tista)t1;
        System.out.println(t.r);
        t.uliya();
    }
}
