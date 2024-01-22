import java.util.*;
public class amstrong {
    boolean Amstrong(int a){
        int temp=a;
        int sum=0;
        int c=0;
        while(temp!=0){
            temp/=10;
            c++;
        }
        temp=a;
        while (temp!=0) {
            sum+=Math.pow(temp%10,c);
            temp/=10;
        }
        if(sum==a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        int a=Get.nextInt();
        amstrong obj=new amstrong();
        if(obj.Amstrong(a))
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
        
    }
}
