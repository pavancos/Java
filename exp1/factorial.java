import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        fact*=i;
        System.out.println(fact);

    }
}
