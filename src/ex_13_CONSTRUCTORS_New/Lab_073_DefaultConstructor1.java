package ex_13_CONSTRUCTORS_New;

public class Lab_073_DefaultConstructor1 {
    public static void main(String[] args) {
        Student abhimanyu=new Student();
        System.out.println(abhimanyu.name);
        System.out.println(abhimanyu.marks);
        System.out.println(abhimanyu.grade);

        System.out.println("------------------------------");

        Student akash = new Student();
        akash.name="Akash Singh";
        akash.marks=90;
        akash.grade="A";

        System.out.println(akash.name);
        System.out.println(akash.marks);
        System.out.println(akash.grade);


    }
}
