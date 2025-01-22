package TypeCasting;

public class LAB_028_TypeCasting3 {

    public static void main(String[] args) {

        int course = 499;
        float GST = 18.45f;

        float total = course+GST; //Implicit
        System.out.println(total);

        float total1 = (float)course+GST; //Explicit
        System.out.println(total1);

//       int total3 = course+GST; Implicit Narrowing
      int total4 = course+(int)GST;  //Explicit Narrowing
       System.out.println(total4);



    }
}
