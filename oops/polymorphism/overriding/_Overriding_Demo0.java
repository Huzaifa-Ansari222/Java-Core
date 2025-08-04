package oops.polymorphism.overriding;

public class _Overriding_Demo0 {
    public static void main(String[] args) {
        System.out.println("Demo of overriding:");
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound(); // Dog barks
        a2.makeSound(); // Cat meows
    }
}

class Animal {
    void makeSound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("::Dog barking::");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("::Cat Meowing::");
    }
}
