package Constractor;

public class Student {
    String name,gender;
    int age,id;

    Student(String n,String g,int a,int i){
        name=n;gender=g;age=a;id=i;
    }
    void display(){
        System.out.println(name+" "+gender+" "+age+" "+id);
    }
}
