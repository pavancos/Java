public class typeOL {
    static double sum(int num1, int num2) {
        float s = 0;
        s = num1 + num2;
        return s;
    }

    static double sum(int num1, float num2) {
        float s = 0;
        s = num1 + num2;
        return s;
    }

    static double sum(int num1, double num2) {
        double s = 0;
        s = num1 + num2;
        return s;
    }

    public static void main(String[] args) {
        double result = 0;
        result = sum(1, 2);
        System.out.println("sum " + result);
        result = sum(2, 2.56F);
        System.out.println("sum " + result);
        result = sum(3, 3.25);
        System.out.println("sum " + result);
    }
}