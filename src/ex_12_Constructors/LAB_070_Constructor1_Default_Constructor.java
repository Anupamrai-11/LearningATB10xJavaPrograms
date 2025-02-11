package ex_12_Constructors;

public class LAB_070_Constructor1_Default_Constructor {
    public static void main(String[] args) {
        A def =new A();
        def.show();
    }
}

class A{

    int a;int b;
    A(){
        a=90;b=89;
    }
    void show(){
        System.out.println(+a + " " +b);
    }
}

