package ex_15_OOPs.Inheritance.SingleLevel;

public class Lab_079 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.land);
        son.bhk1();
        son.bhk3();
    }
}

class Father {
    String land = "10 Acres";

    void bhk1(){
        System.out.println("Father have 1BHK");
    }
}

 class Son extends Father {
    void bhk3(){
        System.out.println("Son have 2bhk");
    }
 }