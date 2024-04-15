interface sample1{
    void call1();
}
interface sample2{
    void call2();
}
class sample implements sample1,sample2{
    public void call1(){
        System.out.println("Call1");
    }
    public void call2(){
        System.out.println("Call2");
    }
}
public class CallMul {
    public static void main(String[] args) {
        sample s=new sample();
        s.call1();
        s.call2();
    }
}
