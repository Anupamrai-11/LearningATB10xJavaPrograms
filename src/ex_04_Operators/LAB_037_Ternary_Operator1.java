package ex_04_Operators;

public class LAB_037_Ternary_Operator1 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2

        int i = 60;
        String s1 = i>=18 ? "No,You Can't":"Yes,You Can";
        System.out.println(s1);

        int j =16;
        String s2 = j<=16 ? "A":"B";
        System.out.println(s2);
    }
}
