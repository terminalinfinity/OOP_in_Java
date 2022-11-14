package ClassAndObject3;

public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.insert(101,"Jannat",12000);
        e2.insert(102,"Noor",1300);
        e3.insert(103,"Minnat",1400);

        e1.display();
        e2.display();
        e3.display();
    }
}
