package TASK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TASK_03_Postive_Negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your number");
        int i = sc.nextInt();

        if(i<0)
        {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Positive");
        }
    }
}
