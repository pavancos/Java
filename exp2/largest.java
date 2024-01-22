import java.util.Scanner;

public class largest {
    int Large (int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }
        if(b>a&&b>c){
            return b;
        }
        if(c>a&&c>b){
            return c;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        int a=Get.nextInt();
        int b=Get.nextInt();
        int c=Get.nextInt();
        largest obj=new largest();
        System.out.println("Largest is: "+ obj.Large(a, b, c));
        Get.close();
    }
}
