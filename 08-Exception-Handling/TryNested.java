public class TryNested {
    public static void main(String[] args) {
        try {
            try{
                int[] b = { 1 };
                b[11] = 1;
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
    }
}
