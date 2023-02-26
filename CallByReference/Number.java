package CallByReference;

public class Number {
    int a,b;
    Number(int x,int y){
        a=x;
        b=y;
    }
    void ChangeValue(Number n){
        n.a=n.a/2;
        n.b=n.b*2;
    }
}
