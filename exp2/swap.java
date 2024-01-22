import java.util.Scanner;

public class swap {
    int a, b;
    void S(swap obj){
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        System.out.println("Enter a, b");
        swap obj=new swap();
        obj.a=Get.nextInt();
        obj.b=Get.nextInt();
        obj.S(obj);
        System.out.println("a="+obj.a+" b="+obj.b);
        Get.close();
    }
}
