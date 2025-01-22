package TypeCasting;

public class LAB_027_TypeCasting_Narrowing2 {

    public static void main(String[] args) {

        long l = 28827722;

        short s = (short) l;
        System.out.println(s); // Data loss

    }
}
