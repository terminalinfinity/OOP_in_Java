package constractorOverloding;

public class Test {
    public static void main(String[] args) {
        Student s0=new Student();
        Student s1=new Student("Jhon","Male",20);
        Student s2=new Student("Nur",25,302);

        s1.display();
        s2.display();
    }
}
