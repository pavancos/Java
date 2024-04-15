class Hello{
    public void ShowHello() {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello");
    }
}
class Hi{
    public void ShowHi() {
        for (int i = 0; i < 5; i++) 
            System.out.println("Hi");
    }
}
public class NoThread {
    public static void main(String[] args) {
        Hello hlo = new Hello();
        Hi hi = new Hi();
        hlo.ShowHello();hi.ShowHi();
    }
}