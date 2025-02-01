package ex_10_Strings;

public class LAB_066_String_02 {

    public static void main(String[] args) {
        String str = "Hello";
        str.concat("Java");  // code will run due string mutable nature of string
        str= str.concat("\n Java");
        System.out.println(str);
    }
}
