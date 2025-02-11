package ex_12_Constructors;

public class LAB_071_DefaultConstructor2 {
    public static void main(String[] args) {
               B a3 = new B();
               a3.display();
               C a4=new C();
               a4.display1();
    }
}
class B {
    int a1;
    String s;

    B() {
        a1 = 90;
        s = "Java";
    }

    void display() {
        System.out.println(a1 + " " + s);
    }
}

class C {
    int a1;
    String s;

    C() {
        a1 = 90;
        s = "Java";
    }

    void display1() {
        System.out.println("Hi");
    }
}
