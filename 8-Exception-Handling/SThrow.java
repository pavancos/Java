public class SThrow {
    public SThrow(){
        try{
        throw new ArithmeticException("hello");
        }
        catch(ArithmeticException e)
        {
        System.out.println("Caught");
        throw e;
        }
        }
}

class ThrowDemo2 {
    public static void main(String args[]) {
        try {
            SThrow obj = new SThrow();
        } catch (ArithmeticException e) {
            System.out.println("ReCaught");
        }
    }
}
