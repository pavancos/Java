public class numberOL {
    static int sum(int a, int b) {
        int s = 0;
        s = a + b;
        return s;

    }
    static int sum(int a, int b, int c) {
        int s = 0;
        s = a + b + c;
        return s;
    }
    static int sum(int a, int b, int c, int d) {
        int s = 0;
        s = a + b + c + d;
        return s;
    }
    public static void main(String[] args) {
        int result = 0;
        result = sum(1, 2);
        System.out.println("Sum: " + result);
        result = sum(1, 2, 3);
        System.out.println("Sum: " + result);
        result = sum(1, 2, 3, 4);
        System.out.println("Sum: " + result);
    }
}