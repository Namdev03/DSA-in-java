package Inheritance;
class Animal{
    String name = "dog";
    void eat(){
        System.out.println("Annimals are eating");
    }
    void sleep(){
        System.out.println("All Annimal are sleeping");
    }
}
class Dog extends Animal{
    void dog(){
        System.out.println(name+" is barking");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.dog();
        d.eat();
        d.sleep();
    }
}
