abstract class Bird{
    abstract void Fly();
    abstract void Sound();
}
class Eagle extends Bird{
    public void Fly(){
        System.out.println("Eagles Flying");
    }
    public void Sound(){
        System.out.println("Eagles Loud Whistle");
    }
}
class Hawk extends Bird{
    public void Fly(){
        System.out.println("Hawks Flying");
    }
    public void Sound(){
        System.out.println("Hawks Scream");
    }
}
public class CallBirds {
    public static void main(String[] args) {
        Bird B=new Eagle();
        B.Fly();
        B.Sound();
        B=new Hawk();
        B.Fly();
        B.Sound();
    }
}