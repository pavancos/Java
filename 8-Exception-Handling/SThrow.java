public class TDemo2 {
    public TDemo2(){
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
            TDemo2 obj = new TDemo2();
        } catch (ArithmeticException e) {
            System.out.println("ReCaught");
        }
    }
}
