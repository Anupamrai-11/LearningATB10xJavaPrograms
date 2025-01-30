package ex_08_ForLoop;

public class LAB_058_For_Continue {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i==5){
//                System.out.println(i);
                continue;
            }
            System.out.println(i);
        }
    }
}
