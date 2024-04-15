abstract class Animal{
    abstract void sound();
}
class Lion extends Animal{
    public void sound(){
        System.out.println("Lion Roar");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger Growl");
    }
}
public class CallLionTiger{
    public static void main(String[] args) {
        Animal A= new Lion();
        A.sound();
        A=new Tiger();
        A.sound();
    }
}
