package ex_04_TypeCasting;

public class LAB_026_TypeCasting2_narrowing {
    public static void main(String[] args) {

        int n = 10;

//        byte b = n; Implicit type is not allowed

        byte b = (byte) n;
        System.out.println(b);

    }
}
