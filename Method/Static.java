package Mathod;

public class Static {
    void display(){
        System.out.println("Normal Method");
    }
    static void display1(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Static obj=new Static();
        obj.display();
        Static.display1();
    }
}
