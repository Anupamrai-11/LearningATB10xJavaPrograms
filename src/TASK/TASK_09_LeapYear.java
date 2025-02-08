package TASK;

import java.util.Scanner;

public class TASK_09_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Non Leap Year");
        }
    }
}
