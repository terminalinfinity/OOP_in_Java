package ClassAndObject3;

public class Employee {
    String name;
    int id,salary;
    void insert(int i,String n,int s){
        id=i;
        name=n;
        salary=s;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
