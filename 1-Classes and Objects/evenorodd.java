import java.util.Scanner;
public class evenorodd {
    boolean EvOd(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Get.nextInt();
        evenorodd obj=new evenorodd();
        if(obj.EvOd(a))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
