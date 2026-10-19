package semester4.oop;

// Polymorphism and Inheritance Demonstration
class Animal {
    void sound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks: Woof Woof"); }
}

public class OOPDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
