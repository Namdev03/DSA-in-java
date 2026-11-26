package Inheritance;

class Employee{
    String department = "HR";
    void meeting(){
        System.out.println("Meeting is sedule for tomorrow");
    }
    void louch(){
        System.out.println("Lounch break is going");
    }
}
class Hrdepartment extends Employee{
    void Hr(){
        System.out.println("wellcome to our compny "+department);
    }
}
public class Employe {
    public static void main(String[] args) {
        Hrdepartment h= new Hrdepartment();
        h.Hr();
        h.meeting();
        h.louch();
    }
    
}
