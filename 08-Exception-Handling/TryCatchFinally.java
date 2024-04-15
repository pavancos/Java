public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] a = { 1 };
            a[11] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally{
            System.out.println("Finally block is executed");
        }
    }
}
