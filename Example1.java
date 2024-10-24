
//Super class Hillstation
class Hillstation {
    // Methods in the Base class
    void location() {
        System.out.println("These are Hillstations. ");
    }

    void famousFor() {
        System.out.println("Hillstations are famous for its beauty. ");
    }
}

// subclass named Manali extends Hillstation
class Manali extends Hillstation {
    // overriden methods of base class
    @override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @override
    void famousFor() {
        System.out.println("Manali is famous for its snow-clad mountains and adventure sports.");
    }
}
// subclass named Mussoorie extends Hillstation

class Mussoorie extends Hillstation {
    // overriden methods of base class
    @override
    void location() {
        System.out.println("Mussoorie is located in UttaraKhand.");
    }

    @override
    void famousFor() {
        System.out.println("Mussoorie is famous for its scenic beauty and pleasant weather.");
    }

}
// subclass named Gulmarg extends Hillstation

class Gulmarg extends Hillstation {
    // overriden methods of base class
    @override
    void location() {
        System.out.println("Gulmarg is located in J&K.");
    }

    @override
    void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and beautiful meadows.");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Hillstation H = new Hillstation();// Parent class Hillstation's object
        Hillstation M = new Manali(); // subclass Manali's object with reference parent
        Hillstation Mu = new Mussoorie();// subclass Mussoorie's object with reference parent
        Hillstation G = new Gulmarg();// subclass Gulmarg's object with reference parent

        // Method calls
        H.location();
        H.famousFor();
        M.location();
        M.famousFor();
        Mu.location();
        Mu.famousFor();
        G.location();
        G.famousFor();

    }
}
