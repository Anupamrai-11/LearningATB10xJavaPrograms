package ex_06_If_else_statement;

import java.util.Scanner;

public class LAB_050_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
