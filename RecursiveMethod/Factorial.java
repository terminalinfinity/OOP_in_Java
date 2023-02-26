package RecursiveMethod;

public class Factorial {
    int fact(int n){
        int result;
        if(n<=0)
            return 1;
        else {
            result=n*fact(n-1);//recursion makes here
            return result;
        }
    }
}
