package TestNewKnowledges;

public class A {
    String name;
    static void a(){
        System.out.println("a in A");
    }
    void b(){
        System.out.println("b in A");
    }
}
class B extends A{
    int age;


    static void a() {
        System.out.println("a in B");
    }

    @Override
    void b() {
        System.out.println("b in B");
    } 

} 

class testAB{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = (B) a2;
        System.out.println(b1.name);
        b1.b();
    }
}
