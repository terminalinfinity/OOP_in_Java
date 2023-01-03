package Mathod;

public class Instance {
    int add(int a,int b){
        int s=a+b;
        return s;
    }

    public static void main(String[] args) {
        Instance obj=new Instance();
        //invoking instance method
        System.out.println("Sum is:"+obj.add(20,50));
    }
}
