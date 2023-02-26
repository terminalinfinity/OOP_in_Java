package CallByValue;

public class Test {
    public static void main(String[] args) {
        Number n=new Number();
        int a=20,b=30;
        System.out.println("Before Calling Method:");
        System.out.println("a="+a +" b="+b);

        n.ChangeValue(a,b);
        System.out.println("After Calling Method:");
        System.out.println("a="+a +" b="+b);
        System.out.println("NO CHANGE!!!");
    }
}
