package ex_06_If_else_statement;

import java.util.Scanner;

public class LAB_051_HighestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("number1 is greater");
        }
        else{
            System.out.println("number2 is greater");
        }
    }
}
