public class FThrow {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Throw Msg");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}