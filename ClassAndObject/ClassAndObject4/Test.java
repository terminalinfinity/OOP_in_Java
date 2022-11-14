package ClassAndObject4;

public class Test {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(201,"Jannat",250000);
        a1.display();
        a1.checkBalance();
        a1.deposit(20000);
        a1.checkBalance();
        a1.withdraw(3000);
        a1.checkBalance();
    }
}
