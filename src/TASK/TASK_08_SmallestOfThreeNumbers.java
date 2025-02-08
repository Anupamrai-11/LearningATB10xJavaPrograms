package TASK;

public class TASK_08_SmallestOfThreeNumbers {

    public static void main(String[] args) {
        int num1 = 91; int num2=92 ; float num3 = 01f;

        if(num1<num2 && num1<num3)
        {
            System.out.println("Number 1 is smaller");
        } else if (num2<num1 && num2<num3)
        {
            System.out.println("Number 2 is smaller");
        }
        else if (num1 == num3 && num1 ==num2)
        {
            System.out.println("All numbers are equal");
        }

        else
        {
            System.out.println("Number 3 is smaller");
        }
    }
}
