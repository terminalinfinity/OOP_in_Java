package CallByReference;

public class Test {
    public static void main(String[] args) {
        Number obj=new Number(20,30);
        System.out.println("Before Calling Method:");
        System.out.println("a="+obj.a +"  b="+obj.b);
        obj.ChangeValue(obj);
        System.out.println("After Calling Method:");
        System.out.println("a="+obj.a +"  b="+obj.b);
        System.out.println("CHANGE!!");
    }
}
