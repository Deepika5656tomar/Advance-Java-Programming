//Parent class 
class Animal{
    // method of parent class
    void makeSound(){
        System.out.println("The animal makes sound.");
    }
}
//subclass Dog
class Dog extends Animal{
    //overridden method of Class dog
    @override
    void makeSound(){
        System.out.println("The Dog barks.");
    }
}
class Cat extends Animal{
    //overridden method of Class cat
    @override
    void makeSound(){
        System.out.println("The Cat meows.");
    }
}


public class Example2 {
    public static void main(String[] args) {
        Animal animal = new Animal();// object of parent class 
        Dog dog = new Dog();// object of subclass dog
        Cat cat = new Cat();//object of subclass cat

        //method call by using objects
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
