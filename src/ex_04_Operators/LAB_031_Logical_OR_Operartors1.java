package ex_04_Operators;

public class LAB_031_Logical_OR_Operartors1 {

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        System.out.println(!!a);  // ! is NOT operator

        boolean b = true || false;
        System.out.println(b);

        boolean d = true || true;
        System.out.println(d);

        boolean r = false || true;
        System.out.println(r);   //   "||" is OR OPERATOR
    }
}
