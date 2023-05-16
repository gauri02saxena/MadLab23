interface Testable{
    void display();
}
class Test implements Testable{
    public void display(){
}
}

abstract class AbsTset implements Testable{
    public void display(){}
}

public class Main{
    public static void main(String args[]){
        Testable obj=new Test();
        obj.display();
    }
}