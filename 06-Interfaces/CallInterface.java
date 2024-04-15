import java.util.*;

interface sample {
    void call();
}

class CallSample implements sample {
    public void call() {
        System.out.println("Interface\n");
    }
}

public class CallInterface {
    public static void main(String[] args) {
        CallSample s = new CallSample();
        s.call();
    }

}