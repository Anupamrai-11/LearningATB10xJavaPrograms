package ex_08_ForLoop;

public class LAB_056_EvenOdd {
    public static void main(String[] args) {
        for (int i =0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even-> " +i);
            }
            else {
                System.out.println("Odd-> " +i);
            }
        }
    }
}
