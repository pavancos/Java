class ThrowDemo{
    public ThrowDemo() {
        try {
            throw new ArithmeticException("hello");
        } catch (ArithmeticException e) {
            System.out.println("Caught");
            throw e;
        }
    }
}

public class SThrow {
    public static void main(String[] args) {
        try {
            ThrowDemo obj = new ThrowDemo();
        } catch (ArithmeticException e) {
            System.out.println("ReCaught");
        }
    }
}
