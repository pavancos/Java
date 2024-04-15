interface sample1{
    void call1();
}
interface sample2 extends sample1{
    void call2();
}
class sample implements sample2{
    public void call1(){
        System.out.println("Call1");
    }
    public void call2(){
        System.out.println("Call2");
    }
}
class callSamp extends sample{
    public void call1(){
        System.out.println("Call1 in extended class");
    }
    public void call2(){
        System.out.println("Call2 in extended class");
    }
}
public class callRel {
    public static void main(String[] args) {
        sample s=new sample();
        s.call1();
        s.call2();
        s=new callSamp();
        s.call1();
        s.call2();
    }
}
