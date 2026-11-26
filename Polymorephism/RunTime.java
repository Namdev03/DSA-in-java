package Polymorephism;
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTime {

    public static void main(String[] args) {

        

      Dog  a = new Dog();
        a.sound();

       Cat b = new Cat();
        b.sound();
    }
}
