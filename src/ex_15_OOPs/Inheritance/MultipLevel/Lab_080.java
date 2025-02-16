package ex_15_OOPs.Inheritance.MultipLevel;

public class Lab_080 {
    public static void main(String[] args) {
        GrandFather g= new GrandFather();
        Father f = new Father();
        Son s = new Son();

        g.rk1();  // Grandfather's method

        f.rk1();  // father's method
        f.bhk1(); // father's method

        s.rk1(); // son's method
        s.bhk1();// son's method
        s.bhk2(); // son's method
    }
}
