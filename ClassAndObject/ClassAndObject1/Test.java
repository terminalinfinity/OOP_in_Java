package ClassAndObject1;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Noor";
        t1.gender="Female";
        t1.phone=012;

        Teacher t2=new Teacher();
        t2.name="Jannat";
        t2.gender="Female";
        t2.phone=0624;

        Teacher t3=new Teacher();
        t3.name="Emon";
        t3.gender="male";
        t3.phone=0162;

        t1.display();
        t2.display();
        t3.display();
    }
}
