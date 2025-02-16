package ex_14_Arrays;

import java.util.Arrays;

public class Lab_078_Arrays_1D_Arrays3_sorting {
    public static void main(String[] args) {
        int i[] = {12, 90, 88, 7, -9, 82, 12};
        Arrays.sort(i);

        System.out.print("{");
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);
            if (j < i.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
