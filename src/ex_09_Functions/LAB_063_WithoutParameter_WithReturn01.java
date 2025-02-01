package ex_09_Functions;

public class LAB_063_WithoutParameter_WithReturn01 {
    public static void main(String[] args) {
        greetMyName("Anupam Rai");

        name_with_marks("Anupam Rai ",89);

    }
    static void greetMyName(String fullName) {
        System.out.println("My name is " + fullName);

    }
    static void name_with_marks(String name, int marks){
        System.out.println("Student name is " +name +marks);
    }
}
