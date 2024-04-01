class Hello{
    public void ShowHello() {
        for (int i = 0; i < 5; i++){
            try{Thread.sleep(1000);}catch(Exception e){};
            System.out.println("Hello");
        }
    }
}
class Hi{
    public void ShowHi() {
        for (int i = 0; i < 5; i++){
            try{Thread.sleep(1000);}catch(Exception e){};
            System.out.println("Hi");
        }
    }
}
public class Sleep {
    public static void main(String[] args) {
        Hello hlo = new Hello();
        Hi hi = new Hi();
        hlo.ShowHello();hi.ShowHi();
    }
}
