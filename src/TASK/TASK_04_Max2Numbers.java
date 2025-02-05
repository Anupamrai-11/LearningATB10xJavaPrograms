package TASK;

import java.util.Scanner;

public class TASK_04_Max2Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1");
        int n = sc.nextInt();
        System.out.println("Enter your number 2");
        int n1 = sc.nextInt();

        if(n>n1)
        {
            System.out.println("Number 1 is greater");
        } else if (n==n1)
        {
            System.out.println("Both number are equal");
        }
        else
        {
            System.out.println("Number 2 is greater");
        }

    }
}
