public class FThrow {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("hello");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}