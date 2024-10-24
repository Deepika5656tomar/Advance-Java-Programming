public class AbstractClass {
    abstract class Abst{
        void show(){
            System.out.println("Non Abstract Method.");
        }
        abstract void show1();
    }
    class Abst1 extends Abst{
        void show1(){
            System.out.println("Abstract method");
        }
    }
    public static void main(String[] args) {
        AbstractClass outer=new AbstractClass();
        // Abst1 ab=new Abst1();
        Abst1 ab=outer.new Abst1();
        ab.show();
        ab.show1();
    }
    
}
