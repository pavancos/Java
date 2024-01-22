import java.util.*;
import java.lang.Math;
public class prime {
    boolean prmCheck(int n){
        int f=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                f=0;
            }
        }
        return (f==1);
    }
    void prm(int n){
        prime Check = new prime();
        System.out.println("Primes upto "+n+" :");
        for(int i=0;i<n;i++){
            if((Check.prmCheck(i))){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=Get.nextInt();
        prime P = new prime();
        P.prm(num);
        Get.close();
    }
}
