package TASK;

import java.util.Scanner;

public class TASK_05_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        float age = sc.nextFloat();

        if (age>=18) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
