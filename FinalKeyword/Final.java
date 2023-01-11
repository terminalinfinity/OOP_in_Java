package FinalKeyword;

public class Final {
    final String uvName="EUB";
    static final int fee;
    static {
        fee=5600;
    }
    void display(){
        System.out.println("University Name:"+uvName);
        System.out.println("Fee:"+fee);
    }

    public static void main(String[] args) {
        Final obj=new Final();
        obj.display();
    }
}
