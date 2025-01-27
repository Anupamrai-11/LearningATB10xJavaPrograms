package ex_06_If_else_statement;

import java.util.Scanner;

public class LAB_047_If_else_ViaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("U are allowed to vote");
        }
        else {
            System.out.println("U are not allowed to vote");
        }
    }


}
