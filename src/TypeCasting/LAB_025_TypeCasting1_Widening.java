package TypeCasting;

public class LAB_025_TypeCasting1_Widening {
    public static void main(String[] args) {

        byte b = 10;

        int a = b; //Implicit typecasting(no need to write data type)
        System.out.println(b);
        System.out.println(a);

        int a1 = 78;
        float f = (float)a1; //Explicit typecasting (need to write data type)

        System.out.println(f);
        System.out.println(a1);


    }

}
