public class orderOL {
    static float sum(int num1, int num2) {
        int s = 0;
        s = num1 + num2;
        return s;
    }

    static float sum(int num1, float num2) {
        float s = 0;
        s = num1 + num2;
        return s;
    }

    static float sum(float num1, int num2) {
        float s = 0;
        s = num1 + num2;
        return s;
    }

    public static void main(String[] args) {
        float res = 0;
        res = sum(1, 2);
        System.out.println("sum " + res);
        res = sum(2, 2.5F);
        System.out.println("sum " + res);
        res = sum(3.45F, 3);
        System.out.println("sum " + res);
    }
}