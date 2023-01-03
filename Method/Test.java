package Method;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Noor";
        t1.gender="Female";
        t1.phone=01243;

        Teacher t2=new Teacher();
        t2.name="Jannat";
        t2.gender="Female";
        t2.phone=02345;

        t1.display();
        t2.display();
    }
}
