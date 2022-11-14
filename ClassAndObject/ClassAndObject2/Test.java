package ClassAndObject2;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Jannat";
        s1.id=10;

        Student s2=new Student();
        s2.name="Noor";
        s2.id=20;

        s1.display();
        s2.display();
    }
}
