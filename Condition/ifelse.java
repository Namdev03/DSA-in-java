package Condition;

public class ifelse {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 30) {
            System.out.println("Your illegibale to vote");
        } else {
            System.out.println("you are Not elegible to Vote");
        }
        int a = 30;
        if (a <= 20) {
            System.out.println("hii");
        } else if (a <= 30) {
            System.out.println(a);
        } else {
            System.out.println("accuracy");
        }
        int Day = 7;

        String b = "Welcome to day " + Day;

        String s = (Day >= 4) ? b : "Today I am busy";

        System.out.println(s);

    }
}
