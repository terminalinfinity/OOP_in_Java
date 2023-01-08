package MathodOverriding;

public class Student extends Person{
    double cgpa;

    @Override
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);
    }
}
