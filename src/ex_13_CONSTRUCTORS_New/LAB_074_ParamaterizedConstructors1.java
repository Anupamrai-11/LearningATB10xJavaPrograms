package ex_13_CONSTRUCTORS_New;

public class LAB_074_ParamaterizedConstructors1 {
    public static void main(String[] args) {
        Student1 s = new Student1("Snehasis",10,"B");
        System.out.println(s.name);
        System.out.println(s.rollNumber);
        System.out.println(s.grade);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Student1 s1 = new Student1("Anupam",90,"A");
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.grade);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Student2 s3=new Student2("Anu",87);
        System.out.println(s3.name);
        System.out.println(s3.rolNumber);
    }


}
class Student1
{
    String name;
    int rollNumber;
    String grade;

    Student1(String name,int rollNumber,String grade){
        this.name = name;
        this.rollNumber=rollNumber;
        this.grade=grade;
    }


    }
class Student2{
    String name;
    int rolNumber;

    Student2(String nam,int rN){
        this.name=nam;
        this.rolNumber=rN;


    }

}