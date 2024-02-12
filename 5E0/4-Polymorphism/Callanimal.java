class animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}
class bird extends animal{
    public void makeSound(){
        System.out.println("Bird Sound");
    }
}
class cat extends animal{
    public void makeSound(){
        System.out.println("Cat Sound");
    }
}
public class Callanimal{
    public static void main(String[] args){
        animal a=new animal();
        a.makeSound();
        bird b=new bird();
        b.makeSound();
        cat c=new cat();
        c.makeSound();
    }
}