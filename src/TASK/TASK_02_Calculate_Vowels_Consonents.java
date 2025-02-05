package TASK;

public class TASK_02_Calculate_Vowels_Consonents {

    public static void main(String[] args) {
        String s = "pramod";
        int vcount =0;
        int ccount =0;

        for (int i=0;i<s.length();i++ ){
          if (s.charAt(i)== 'a' || s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vcount++;
            }
          else {
              ccount++;
          }
        }

        System.out.println("Vowels >> " +vcount);
        System.out.println("Consonents >> " +ccount);


    }
}
