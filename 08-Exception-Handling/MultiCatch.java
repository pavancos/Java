public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a=10/0;
            int[] b={1};
            b[11]=1;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
    }
}
