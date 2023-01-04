package ThisKyeword;

public class Person {
    String name;int age;
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String[] args) {
        Person p1=new Person("Jannat",22);
        Person p2=new Person("Nur",20);
        p1.display();
        p2.display();
    }
}
