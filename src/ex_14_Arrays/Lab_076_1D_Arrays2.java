package ex_14_Arrays;

import java.util.Arrays;

public class Lab_076_1D_Arrays2 {
    public static void main(String[] args) {
        int[] n={90,-9,23,0,92};
        Arrays.sort(n);

        for (int i =0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
