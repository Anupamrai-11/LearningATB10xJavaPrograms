package TASK;

import java.util.Scanner;

public class TASK_07_SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        if (num < num2) {
            System.out.println("Number 1 is smallest");
        } else if (num == num2) {
            System.out.println("Both number are equal");
        }
        else{
            System.out.println("Number2 is smallest");
        }

    }
}