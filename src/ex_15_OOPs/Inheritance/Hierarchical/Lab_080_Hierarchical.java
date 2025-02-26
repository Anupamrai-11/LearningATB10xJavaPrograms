package ex_15_OOPs.Inheritance.Hierarchical;

public class Lab_080_Hierarchical {
    public static void main(String[] args) {
        Father f = new Father();
        Rahul r1 = new Rahul();
        Rohan ro = new Rohan();
        Ruhani ru = new Ruhani();

        System.out.println(f.land);
        f.gold();
        System.out.println("----------------------------------");

        System.out.println(r1.land);
        r1.gold();
        r1.rahul();
        System.out.println("----------------------------------");
        System.out.println(ro.land);
        ro.gold();
        ro.rohan();
        System.out.println("----------------------------------");
        System.out.println(ru.land);
        ru.ruhani();
        ru.gold();
        System.out.println("----------------------------------");
    }
}

class Father {
    String land = "5 Acres";

    void gold(){
        System.out.println("5 kg gold");
    }

}

class Rahul extends Father{
    void rahul(){
        System.out.println("Rahul's home");
        System.out.println("Rahul's land");
    }
}

class Rohan extends Father{
    void rohan(){
        System.out.println("Rohan's home");
    }
}

class Ruhani extends Father{
    void ruhani(){
        System.out.println("Ruhani's home");
    }
}