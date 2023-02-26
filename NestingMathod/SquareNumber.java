package NestingMathod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareNumber {
    private int num;
    int Square(){
        num=num*num;
        return (num);
    }
    void getnum(){
        String s;
        try{
            System.out.print("Enter an Integer Number:");
            BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
            s=BR.readLine();
            num=Integer.parseInt(s);
        }
        catch (Exception e){
            System.out.println("Error in input!!");
        }
    }
    void display(){
        getnum();
        int sv=Square();
        System.out.println("Square is:"+sv);
    }
}
