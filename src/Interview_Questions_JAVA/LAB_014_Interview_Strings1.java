package Interview_Questions_JAVA;

import java.sql.SQLOutput;

public class LAB_014_Interview_Strings1 {
    public static void main(String[] args) {
        String s1 = "Effiel";
        String s2= "Effiel";

        String s3 = new String("World");
        String s4 = new String("eFFieL");


        System.out.println(s1 == s2);
        System.out.println(s1==s3);
        System.out.println(s3.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s1));


    }
}
