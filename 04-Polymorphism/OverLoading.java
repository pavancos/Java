class Overloading {
    static double sum(int num1, int num2) {
        double s = 0;
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
        result = sum(10, 40);
        System.out.println("Sum : " + result);
        result = sum(10, 30.56F);
        System.out.println("Sum : " + result);
    }
}
