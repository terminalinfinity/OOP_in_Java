package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person();

        p1.setName("Nur");
        p1.setAge(22);
        p1.uni="EUB";

        System.out.println("Name:"+p1.getName());
        System.out.println("Age:"+p1.getAge());
        System.out.println("University:"+p1.uni);
    }
}
