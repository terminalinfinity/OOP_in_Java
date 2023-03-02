package Interface;

class Result implements Student{
    public float mark;
    public void display(){
        System.out.println("Name is:"+name);
        System.out.println("Roll is:"+roll);
    }
    public void GetMark(){
        mark=4.96f;
    }
    public void ShowMark(){
        System.out.println("Mark is:"+mark);
    }
}
