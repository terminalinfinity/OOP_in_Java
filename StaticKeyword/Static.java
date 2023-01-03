package StaticKeyword;

public class Static {
    String name;int id;
    static String uvName="EUB";

    Static(String n,int i){
        name=n;id=i;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("University Name:"+uvName);
    }
}
