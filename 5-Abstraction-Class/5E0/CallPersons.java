abstract class Person{
    abstract void eat();
    abstract void exercise();
}

class LazyFellow extends Person{
    public void eat(){
        System.out.println("Lazy ppl Eat Junk");
    }
    public void exercise(){
        System.out.println("Lazy ppl have low Stamina");
    }
}
class Athelete extends Person{
    public void eat(){
        System.out.println("Athelete Eats healthy");
    }
    public void exercise(){
        System.out.println("Athelete have hi-Stamina");
    }
}
public class CallPersons {
    public static void main(String[] args) {
        Person P=new LazyFellow();
        P.eat();
        P.exercise();
        P=new Athelete();
        P.eat();
        P.exercise();   
    }
    
}
