
package classandobject;

class Car {

    String car1;
    String car2;
    String car3;

    void start(String car) {
        System.out.println("This is first car " + car);
    }

    void end(String car4) {
        System.out.println("This is car 4 " + car4);
    }
}

public class classAndObject {

    public static void main(String[] args) {

        // Object creation
        Car c = new Car();

        // Assigning values
        c.car1 = "BMW";
        c.car2 = "XYZ";
        c.car3 = "DFG";

        // Calling methods
        c.start("GGG");
        c.end("RRR");

        // Printing variables
        System.out.println(c.car1);
        System.out.println(c.car2);
        System.out.println(c.car3);
    }
}
