package constractor;

public class Teacher {
    String name,gender;int age;

    Teacher(String n,String g,int a){
        name=n;gender=g;age=a;
    }
    void display(){
        System.out.println("Name: "+name+" Gender: "+gender+" Age: "+age);
    }
}
