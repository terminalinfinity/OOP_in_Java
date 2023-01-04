package Abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;
        mu=new Jannat() {};
        mu.sendMessage();
        mu=new Noor() {};
        mu.sendMessage();
    }
}
