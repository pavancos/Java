import java.util.*;
interface Abs {
    void call();
}
abstract class sample implements Abs{
    public void call(){
        System.out.println("Starting Vehicle");
    }
}
class sampleCall extends sample{
    public void call(){
        System.out.println("Staring Car");
    }
}
public class CallAbst {
    public static void main(String[] args) {
        sampleCall s=new sampleCall();
        s.call();
    }    
}
