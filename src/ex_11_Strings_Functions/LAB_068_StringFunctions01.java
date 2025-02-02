package ex_11_Strings_Functions;

import java.util.Locale;

public class LAB_068_StringFunctions01 {
    public static void main(String[] args) {
        String name = "String";

        // 01- length()-This will calculate the length of String
        System.out.println(name.length());

        // 02- charAt()- This will return the character(index) as per user input
        System.out.println(name.charAt(4));

        // 03- equals()- This will check the exact String name
        System.out.println(name.equals("String"));

        // 04 -equalsIgnoreCase()- This will check the String name and neglect the alphabet and small letter
        System.out.println(name.equalsIgnoreCase("sTrIng"));

        // 05- indexOf() - Returns the index within this string of the
        System.out.println(name.indexOf("g"));

        // 06 - replace()- This replace letter in String
        System.out.println(name.replace('n','n'));

        // 07 - contains() - Check the String
        System.out.println(name.contains("Sharma"));

        // 08 - concat() - stick new value is String
        System.out.println(name.concat(" Array"));

        // 09 - substring()
        String str1 = "Java";
        System.out.println(str1.substring(1,4));
        System.out.println(name.substring(3,4));
        String ss = "hamburger";
        System.out.println(ss.substring(4,9));

        // 10 -toUpperCase()
        System.out.println(ss.toUpperCase());

        // 11 - toLowerCase()
        System.out.println(str1.toLowerCase());

        // 12 - startsWith() - Check the string from starting
        System.out.println(str1.startsWith("v"));

        // 13 -endsWith() -Check the string from ending
        System.out.println(str1.endsWith("a"));

        // 14 - trim() -  trim the spaces
        String s = "   Akshay Singh    ";
        System.out.println(s.trim());

        // 15 - compareTo-?
        System.out.println(s.compareTo("Akshay"));

        // 16 -split -?



    }
}
