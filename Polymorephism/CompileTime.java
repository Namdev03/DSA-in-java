package Polymorephism;
class Math{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(long a, long b){
        System.out.println(a+b);
    }
}
public class CompileTime {
    public static void main(String[] args) {
        Math m = new Math();
          m.add(100,200);
        m.add(100,200,300);
        m.add(300, 400);
    }
}
