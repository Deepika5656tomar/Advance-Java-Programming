class plane{
    void fly(){
        System.out.println("Plane is flying.");
    }
}
class Cargoplane extends plane{
    void fly(){
        System.out.println("CargoPlane is flying in high speed."); 
    }
    
}
class FighterPlane extends plane{
    void fly(){
        System.out.println("fighter Plane is flying with very high speed.");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        FighterPlane fp=new FighterPlane();
        /* cp.fly();
        fp.fly(); */
        plane ref;
        ref=cp;
        ref=fp;
        ref.fly();
        ref.fly();
    }
}
