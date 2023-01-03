package constractorOverloding;

public class Student {
    String name,gender;int age,id;
    Student(){
        System.out.println("I'm deafult constractor.");
    }
    Student(String n,String g,int a){
        name=n;gender=g;age=a;
    }
    Student(String n,int a,int i){
        name=n;age=a;id=i;
    }
    void display(){
        System.out.println("Name: "+name+" Gender: "+gender+" Age: "+age+" ID:"+id);
    }
}
