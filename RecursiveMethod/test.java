package RecursiveMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws Exception{
        Factorial f=new Factorial();
        int n=0;
        String s;
        for ( ; ;){
            BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Positive number:");
            s= BR.readLine();
            n=Integer.parseInt(s);
            if(n<0){
                System.out.println("Negative Number Not Allowed!!Enter Again!");
            }
            else{
                System.out.println("Factorial of "+n+" is:"+f.fact(n));
            }
        }

    }
}
