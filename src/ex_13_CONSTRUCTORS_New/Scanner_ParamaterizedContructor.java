package ex_13_CONSTRUCTORS_New;

import java.util.Scanner;

public class Scanner_ParamaterizedContructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car");
        String n = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the model");
        int mod = sc1.nextInt();
        Car c = new Car(n,mod);
        System.out.println(c.name);
        System.out.println(c.model);
    }
}

    class Car{
        String name;
        int model;

        Car(String n, int mod){
            this.name = n;
            this.model=mod;
        }
    }

