interface Interface1{
    void show();
}
class Intr implements Interface1{
    public void show(){
        System.out.println(" show method ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Intr i=new Intr();
        i.show(); 
    }
    
}
